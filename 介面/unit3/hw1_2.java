package 介面.unit3;

/*AWT graphics-1基本的繪圖練習， (參考Java 入門邁向高手之路:ch30)
視窗座標(0,0)在左上角，向右為X軸正值，向下Y軸正值
1.extend Frame(getGraphics).
2.利用paint(在window變動時會自動執行)
AWT graphics-1基本的繪圖練習
drawLine(x,y,x',y')(畫直線)
drawPolyline(x's座標array, y's座標array,點總數)(畫折線),
drawRect(左上角x,左上角y, 寬,高)(畫矩形)
drawPolygon(x's座標array, y's座標array,點總數)(畫多邊形)
drawOval(左上角x,左上角y,外圍矩形寬,高)(畫(橢)圓)
drawArc(左上角x,左上角y, 寬,高,arc起始位置度數,arc的度數)(畫弦)
fillRect(左上角x,左上角y, 寬,高)(畫矩形)
fillPolygon(畫多邊形
fillOval(左上角x,左上角y,外圍矩形寬,高)(畫(橢)圓)
fillArc(左上角x,左上角y, 寬,高,arc起始位置度數,arc的度數)(畫弦)
練習：
1.自行設計其他圖形，改變大小，顏色，座標等
2. 將draw 改為fill*/
import java.awt.*;

public class hw1_2 extends Frame {
    static hw1_2 frm = new hw1_2();

    public static void main(String args[]) {
        frm.setTitle("Java 繪圖練習");
        frm.setSize(400, 500);
        frm.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(50, 50, 100, 200);
        g.setColor(Color.pink);
        int[] x_coor = { 100, 200, 200, 150, 100 };
        int[] y_coor = { 100, 100, 150, 200, 150 };
        g.setColor(Color.green);
        g.drawPolygon(x_coor, y_coor, 5);
        g.setColor(Color.red);
        g.drawOval(200, 200, 50, 50);
        g.setColor(Color.yellow);
        g.drawArc(50, 300, 50, 50, 90, 180);
        g.setColor(Color.pink);
        g.drawRect(50, 350, 50, 50);
        g.setColor(Color.black);
        g.drawArc(50, 350, 50, 50, 180, 245);
    }
}
