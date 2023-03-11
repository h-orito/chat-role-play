alter table message drop foreign key fk_message_game;
alter table message drop foreign key fk_message_game_period;
alter table message drop foreign key fk_message_from_game_player;

alter table message_reply drop foreign key fk_message_reply_game;
alter table message_reply drop foreign key fk_message_reply_from_message;
alter table message_reply drop foreign key fk_message_reply_reply_message;

alter table message_favorite drop foreign key fk_message_favorite_game;
alter table message_favorite drop foreign key fk_message_favorite_message;
alter table message_favorite drop foreign key fk_message_favorite_game_player;

alter table direct_message drop foreign key fk_direct_message_game;
alter table direct_message drop foreign key fk_direct_message_game_player_group;
alter table direct_message drop foreign key fk_direct_message_game_period;
alter table direct_message drop foreign key fk_direct_message_from_game_player;

alter table message partition by hash (game_id) partitions 100;
alter table message_reply partition by hash (game_id) partitions 100;
alter table message_favorite partition by hash (game_id) partitions 100;
alter table direct_message partition by hash (game_id) partitions 100;

