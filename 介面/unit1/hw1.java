package 介面.unit1;

/*本單元參考主要參考書ch26
Java 早期的視窗程式設計：
1.AWT(Abstract Window Toolkit),Swing 是目前較新的方法，但都是以AWT為基礎
2.視窗座標系統：(0, 0)左上角，x: 往右，y:往下
3.AWT類別中, Window(包含Frame, Dialog)和Panel都是屬於Container(容器),可以放Label, Button,
TextField等類別物件
(單元一: hw1)本題工作：利用Frame建立視窗，並加入label
練習：
1.將frame title改為"資管系OOO(你(妳)的名字)"
2.將Label的background顏色改為藍色
3.將label的字體改為標楷體，32點
4.將frame 及label的size放大為(300,300)及(200,150)
5.增加一個label，內容及位置自訂(自行練習)*/
import java.awt.*;
public class hw1 {
    static Frame frame = new Frame("範例 awt-1 視窗");
    /* 將frame視為容器，可以放label, button, text等物件 */
    static Label label = new Label("AWT-1標籤");

    public static void main(String[] args) {
        frame.setLocation(600, 100); /* 設定frame 的原點座標 */
        frame.setSize(300, 200); /* 設定frame 的大小 */
        frame.setLayout(null); /* 設定frame上其他物件的排列方式 */
        frame.setVisible(true); /* 設定frame 是否顯示 */
        // frame.setTitle("test");
        label.setLocation(40, 80); /* 設定label的原點位置，相對位置? */
        label.setSize(150, 100);
        label.setBackground(Color.yellow);
        // label.setForeground(Color.red);
        label.setForeground(new Color(255, 0, 0)); /* RGB */
        label.setFont(new Font("細明體", Font.BOLD, 20));
        label.setText("text");
        /* 設定label的字型 */
        frame.add(label); /* 將label 加入frame 中 */
    }
}
