# HelloSpring

## 参考

* [Spring](https://spring.io/)
* [thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf_ja.html)
* [MyBatis](https://mybatis.org/mybatis-3/ja/getting-started.html)
  * [動的 SQL](https://mybatis.org/mybatis-3/ja/dynamic-sql.html)
* [はじめてのSpring Boot　ー ThymeleafとJSPで条件分岐 ー](https://www.casleyconsulting.co.jp/blog/engineer/284/)
* [Spring Boot から MyBatis を利用するための設定](https://www.qoosky.io/techs/b6c5688848)
* [MyBatis 3 サンプルコード (Java/MySQL/Gradle)](https://www.qoosky.io/techs/18e2d7f70f)

## 課題

### 第一問 項目追加

todoテーブルに以下の項目を追加して一覧画面に表示してください。

|項目名|型|表示フォーマット|
|---|---|---|
|ins_dt|日時|yyyy/MM/dd HH24:mm:SS|

### 第二問 MyBatis動的SQL

content項目を入力したときだけ検索SQLのWHERE条件に追加するようにしてください。


### 第三問 前方一致検索

title項目を前方一致検索できるようにしてください。

### 第四問 テーブル結合

todoテーブルとstatusテーブルを結合して、status.status_nmを一覧に表示してください。

### 第五問 デバッグ実行

ブレークポイントを貼って変数の中身を見る。

### 第六問 登録

int_dtにシステム日時が入るようにしてください。
