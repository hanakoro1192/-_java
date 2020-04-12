//アイテムクラス：アイテムクラスはボンバーマンに依存しているため集約
//被爆抽象クラスを継承している
public class Item extends Bombedabstract {

    //フィールド：ボンバーマンと集約の関係
    Bomberman item;

    //メソッド：アイテムを取得する
    public void gain(){
        //処理
    }

    //メソッド：何秒でアイテムが消えるのか
    public void disappear(){
        //処理
    }
}

