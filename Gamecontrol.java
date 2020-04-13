import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//ゲームコントロールクラス；Gamecontrolクラスはボンバーマンに依存している
public class GameControl implements KeyListener {

    //メソッド：ゲームリセット！！の処理
    public void reset(){
        //リセットするときの処理
    }

    //メソッド:ゲームスタート！！が始まるときの処理
    public void start(){

    }

    //メソッド：ゲームオーバーのときの処理
    public void gameover(){

    }



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

}