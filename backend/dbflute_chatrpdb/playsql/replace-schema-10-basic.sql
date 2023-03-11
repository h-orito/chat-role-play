/* Create Tables */

create table designer (
    designer_id       int unsigned not null auto_increment,
    designer_name     varchar(255) not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (designer_id)
);

create table charachip (
    charachip_id      int unsigned not null auto_increment,
    charachip_name    varchar(255),
    designer_id       int unsigned not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (charachip_id)
);

alter table charachip
    add constraint fk_charachip_designer foreign key (designer_id)
    references designer (designer_id)
    on update restrict
    on delete restrict
;

create table chara (
    chara_id          int unsigned not null auto_increment,
    chara_name        varchar(255) not null,
    charachip_id      int unsigned not null,
    display_width     int unsigned not null,
    display_height    int unsigned not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (chara_id)
);

alter table chara
    add constraint fk_chara_charachip foreign key (charachip_id)
    references charachip (charachip_id)
    on update restrict
    on delete restrict
;

create table chara_image (
    chara_image_id    int unsigned not null auto_increment,
    chara_id          int unsigned not null,
    face_type_code    varchar(255) not null,
    chara_img_url     varchar(1000) not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (chara_image_id)
);

alter table chara_image
    add constraint fk_chara_image_chara foreign key (chara_id)
    references chara (chara_id)
    on update restrict
    on delete restrict
;

create table player (
    player_id         int unsigned not null auto_increment,
    player_name       varchar(255) not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (player_id)
);

create table player_account (
    player_account_id int unsigned not null auto_increment,
    player_id         int unsigned not null unique,
    username          varchar(255) not null unique,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (player_account_id)
);

alter table player_account
    add constraint fk_player_account_player foreign key (player_id)
    references player (player_id)
    on update restrict
    on delete restrict
;

create table player_authority (
    player_authority_id int unsigned not null auto_increment,
    player_id         int unsigned not null,
    authority_code    varchar(255) not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (player_authority_id),
    constraint uq_player_authority unique (player_id, authority_code)
);

alter table player_authority
    add constraint fk_player_authority_player foreign key (player_id)
    references player (player_id)
    on update restrict
    on delete restrict
;

create table game (
    game_id           int unsigned not null auto_increment,
    game_name         varchar(255) not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (game_id)
);

create table game_setting (
    game_setting_id   int unsigned not null auto_increment,
    game_id           int unsigned not null,
    game_setting_item_code varchar(255) not null,
    game_setting_item_value varchar(1000) not null,
    primary key (game_setting_id)
);

alter table game_setting
    add constraint fk_game_setting_game foreign key (game_id)
    references game (game_id)
    on update restrict
    on delete restrict
;

create table game_player (
    game_player_id    int unsigned not null auto_increment,
    game_id           int unsigned not null,
    player_id         int unsigned not null,
    game_player_name  varchar(255) not null,
    chara_id          int unsigned not null,
    is_deleted        boolean not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (game_player_id),
    constraint uq_game_player unique (game_id, chara_id, is_deleted)
);

alter table game_player
    add constraint fk_game_player_game foreign key (game_id)
    references game (game_id)
    on update restrict
    on delete restrict
;

alter table game_player
    add constraint fk_game_player_player foreign key (player_id)
    references player (player_id)
    on update restrict
    on delete restrict
;

alter table game_player
    add constraint fk_game_player_chara foreign key (chara_id)
    references chara (chara_id)
    on update restrict
    on delete restrict
;

create table game_period (
    game_period_id    int unsigned not null auto_increment,
    game_id           int unsigned not null,
    period            int unsigned,
    prefix            varchar(255),
    suffix            varchar(255),
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (game_period_id),
    constraint uq_game_period unique (game_id, period)
);

alter table game_period
    add constraint fk_game_period_game foreign key (game_id)
    references game (game_id)
    on update restrict
    on delete restrict
;

create table message (
    message_id        bigint not null auto_increment,
    game_id           int unsigned not null,
    message_type_code varchar(255) not null,
    game_period_id    int unsigned not null,
    from_game_player_id int unsigned,
    from_game_player_name varchar(255),
    from_game_player_face_type_code varchar(255),
    message_content   varchar(10000),
    message_number    int unsigned,
    message_datetime  datetime not null,
    message_unix_timestamp_milli bigint unsigned not null,
    is_deleted        boolean not null,
    is_convert_disable boolean not null,
    replied_count     int unsigned not null,
    favored_count     int unsigned not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (message_id, game_id),
    constraint uq_message unique (game_id, message_type_code, message_number)
);

alter table message
    add constraint fk_message_game foreign key (game_id)
    references game (game_id)
    on update restrict
    on delete restrict
;

alter table message
    add constraint fk_message_game_period foreign key (game_period_id)
    references game_period (game_period_id)
    on update restrict
    on delete restrict
;

alter table message
    add constraint fk_message_from_game_player foreign key (from_game_player_id)
    references game_player (game_player_id)
    on update restrict
    on delete restrict
;

create table message_reply (
    message_reply_id  bigint not null auto_increment,
    game_id           int unsigned not null,
    from_message_id   bigint not null,
    reply_message_id  bigint not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (message_reply_id, game_id)
);

alter table message_reply
    add constraint fk_message_reply_game foreign key (game_id)
    references game (game_id)
    on update restrict
    on delete restrict
;

alter table message_reply
    add constraint fk_message_reply_from_message foreign key (from_message_id)
    references message (message_id)
    on update restrict
    on delete restrict
;

alter table message_reply
    add constraint fk_message_reply_reply_message foreign key (reply_message_id)
    references message (message_id)
    on update restrict
    on delete restrict
;

create table message_favorite (
    message_favorite_id bigint not null auto_increment,
    game_id           int unsigned not null,
    message_id        bigint not null,
    game_player_id    int unsigned not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (message_favorite_id, game_id),
    constraint uq_message_favorite unique (game_id, message_id, game_player_id)
);

alter table message_favorite
    add constraint fk_message_favorite_game foreign key (game_id)
    references game (game_id)
    on update restrict
    on delete restrict
;

alter table message_favorite
    add constraint fk_message_favorite_message foreign key (message_id)
    references message (message_id)
    on update restrict
    on delete restrict
;

alter table message_favorite
    add constraint fk_message_favorite_game_player foreign key (game_player_id)
    references game_player (game_player_id)
    on update restrict
    on delete restrict
;

create table game_player_group (
    game_player_group_id int unsigned not null auto_increment,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (game_player_group_id)
);

create table game_player_group_rel (
    game_player_group_rel_id int unsigned not null auto_increment,
    game_player_group int unsigned not null,
    game_player_id    int unsigned not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (game_player_group_rel_id),
    constraint uq_game_player_group_rel unique (game_player_group, game_player_id)
);

alter table game_player_group_rel
    add constraint fk_game_player_group_rel_game_player foreign key (game_player_id)
    references game_player (game_player_id)
    on update restrict
    on delete restrict
;

create table direct_message (
    direct_message_id bigint not null auto_increment,
    game_id           int unsigned not null,
    game_player_group_id int unsigned not null,
    game_period_id    int unsigned not null,
    from_game_player_id int unsigned,
    from_game_player_name varchar(255),
    from_game_player_face_type_code varchar(255),
    message_content   varchar(10000),
    message_number    int unsigned,
    message_datetime  datetime not null,
    message_unix_timestamp_milli bigint unsigned not null,
    is_deleted        boolean not null,
    is_convert_disable boolean not null,
    register_datetime datetime not null,
    register_trace    varchar(64) not null,
    update_datetime   datetime not null,
    update_trace      varchar(64) not null,
    primary key (direct_message_id, game_id),
    constraint uq_direct_message unique (game_id, game_player_group_id, message_number)
);

alter table direct_message
    add constraint fk_direct_message_game foreign key (game_id)
    references game (game_id)
    on update restrict
    on delete restrict
;

alter table direct_message
    add constraint fk_direct_message_game_player_group foreign key (game_player_group_id)
    references game_player_group (game_player_group_id)
    on update restrict
    on delete restrict
;

alter table direct_message
    add constraint fk_direct_message_game_period foreign key (game_period_id)
    references game_period (game_period_id)
    on update restrict
    on delete restrict
;

alter table direct_message
    add constraint fk_direct_message_from_game_player foreign key (from_game_player_id)
    references game_player (game_player_id)
    on update restrict
    on delete restrict
;
