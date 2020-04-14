//ボンバーマンクラス
public class Bomberman extends BombedAbstract{ //ボンバーマンのクラス

    //集約を使用
    Item item;
    
    //フォールドの設定;ボンバーマンの名前
    String name;

    //コンストラクタ　初期化を行った
    public Bomberman(String name){
        this.name = name;
    };

    //メソッドの作成;移動したときのメソッド
    public void moment(){
        //処理の記入
    }

    //爆弾を置いたときのメソッド
    public void Bombput(){
        //Enterを押すときに爆弾を置く処理
    }
    
}