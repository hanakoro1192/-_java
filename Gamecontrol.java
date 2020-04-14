import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame; //デスクトップアプリケーションのため


//ゲームコントロールクラス；Gamecontrolクラスはボンバーマンに依存している
public class GameControl extends JFrame implements KeyListener {

    //集約を利用
    Bomberman bomberman;

    private int keyCode = 0;

    //位置
    double x; // 左右の移動
    double y; //上下の移動

    //速度
    double vx; //左右の速度の速さ
    double vy; //上下の速度の速さ

    //コンストラクタ：Mainで呼び出す
    public GameControl(double x, double y, double vx, double vy){
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        //キーの有効化
        addKeyListener(this);
    }

    //上に移動する
    public void accelerateUp(){
        vy = -SPEED;
    }

    //右に移動する
    public void accelerateDown() {
        vy = SPEED;
    }

    //左に移動する
    public void accelerateLeft() {
        vx = -SPEED;
    }

    //右に移動する
    public void accelerateRight() {
        vx = SPEED;
    }

    //動きがストップ
    public void Stop(){
        
    }

    //キーを押した時に呼び出されるメソッド：ここにボタンを押したときの右、左、↑、↓の処理を入れる
    //どのキーを取得したのかはKeyEventのgetKeyCodeで値を取得
    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP : //矢印キーの上
                //上のキー
                accelerateUp();
                break;
            case KeyEvent.VK_DOWN: //矢印キーの下
                //下のキー
                accelerateDown();
                break;
            case KeyEvent.VK_RIGHT: //矢印キーの右
                //右のキー
                accelerateRight(); 
                break;
            case KeyEvent.VK_LEFT: //矢印キーの左
                //左のキー
                accelerateLeft();
                break;
        }
    }
    
    //キーが離された時に呼び出されるメソッド
    public void keyReleased(KeyEvent e){
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP : //矢印キーの上
                //上のキー
                Stop();
                break;
            case KeyEvent.VK_DOWN: //矢印キーの下
                //下のキー
                Stop();
                break;
            case KeyEvent.VK_RIGHT: //矢印キーの右
                //右のキー
                Stop();
                break;
            case KeyEvent.VK_LEFT: //矢印キーの左
                //左のキー
                Stop();
                break;
        }
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