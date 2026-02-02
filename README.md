## 基本原則
- 責任の分離
- 依存関係
### メリット
- テストしやすい
- 変更に強い
- 理解しやすい
- 再利用しやすい
## 設計原則
### フレームワークとドライバ
- 外部とのやり取り
- UI/DB/外部API
### インターフェースアダプター
- データ形式変換
- データ形式の変換
### ユースケース
- アプリの機能定義
- アプリの具体的な機能
### エンティティ
- ビジネスロジック（重要なルール）
- 基本ルール

## SOLIDの原則
- Single Responsibility Principle (単一責任の原則)
- Open-Closed Principle (オープン・クローズドの原則)
- Liskov Substitution Principle (リスコフの置換原則)
- Interface Segregation Principle (インタフェース分離の原則)
- Dependency Inversion Principle (依存関係逆転の原則)

## 依存関係の逆転原則（Dependency Inversion Principle, DIP）
### DIP
- 依存関係は外側→内側にだけ流れるというルール
- 内側（ビジネスロジック）は外側（UIやDB）のことを知らない、依存しないように設計
### DI（Dependency Injection）
- 依存性注入
- クラスが必要とする依存オブジェクトを自分で new せず、外から渡してもらうこと
### 実現手段例
- 抽象（interface）
```java
interface MessageService {
    void send(String message);
}
```
- 実装（implements）
```java
class EmailService implements MessageService {
    public void send(String message) {
        System.out.println("メール送信: " + message);
    }
}
```
