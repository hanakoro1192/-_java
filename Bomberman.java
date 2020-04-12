import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;




//ボンバーマンクラス
public class Bomberman extends Bombedabstract implements KeyListener { //ボンバーマンのクラス
    //フォールドの設定;ボンバーマンの名前
    String name;

    //フィールドの設定:コマンドキー
    String right; //右コマンド
    String left; //左コマンド
    String above; //上コマンド
    String down; //下コマンド

    //コンストラクタ　初期化を行った
    public Bomberman(String name, String right, String left, String above, String down){
        this.name = name;
        //移動するものの定義
        this.right = right;
        this.left = left;
        this.above = above;
        this.down = down;
        //キー入力の有効化
        addKeyListener(this);
    };

    // //スタートしたときのメソッド
    // public void start(){

    // }

    //キーを押した時に呼び出されるメソッド
    public void keyPressed(KeyEvent e){

    }

    //キーが離された時に呼び出されるメソッド
    public void keyReleased(KeyEvent e){

    }

    //使用しないため殻にしておく
    public void keyTyped(KeyEvent e) {
		//使用しないので空にする.
	}

    //メソッドの作成;移動したときのメソッド
    public void moment(){
        //処理の記入
    }

    //爆弾を置いたときのメソッド
    public void Bombput(){
        //Enterを押すときに爆弾を置く処理
    }
    
}