import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//ゲームコントロールクラス；Gamecontrolクラスはボンバーマンに依存している
public class GameControl implements KeyListener {

    //集約を利用
    Bomberman bomberman;

    //位置
    double x; // 左右の移動
    double y; //上下の移動

    //速度
    double vx; //左右の速度の速さ
    double vy; //上下の速度の速さ

    //左に移動する
    public void accelerateLeft(){
        vx = -moment();
    }

    //右に移動する
    public void accelerateRight(){
        vx = moment();
    }

    //上に移動する
    public void accelerateUp(){
        vy = moment();
    }

    //下に移動する
    public void accelerateDown(){
        vy = -moment();
    }

    //ボンバーマンの状態を更新する
    public void update(){
        x += vx;
        y += vy;
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

}