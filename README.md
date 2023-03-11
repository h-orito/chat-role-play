# chat-role-play

## やりたい機能メモ

- 日記
- 複数発言同時

## 設計メモ

- 表情種別を code じゃなくて id にして自由にする

## memo

- SpringBoot3.0 で javax→jakarta になったので DAO 自動生成後に import 部分を置換する必要がある

```
cd src/main/java/dev/wolfort/dbflute/bsbhv/
find *.java | xargs sed -i "s/javax.annotation/jakarta.annotation/g"
```
