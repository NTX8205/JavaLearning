package 委託.資科B班;
/*

2.	寫一個JAVA程式，假設某班級有五位同學A、B、C、D與E，其JAVA成績如下所示： 
	A 	B 	C 	D 	E 
	90 	82 	56 	41 	70 
(a)寫一程式印出其陣列資料。
(b)計算並印出JAVA成績平均。

*/ 




public class countavg {

    public static void main(String[] args) {
        String[][] classname= {
            {"A","90"},
            {"B","82"},
            {"C","56"},
            {"D","41"},
            {"E","70"}
        };
        float sum=0;
        float avg = 0; 
        for(int i=0;i<5;i++){
            System.out.printf("%-4s",classname[i][0]);
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.printf("%-4s", classname[i][1]);
            sum+=Integer.parseInt(classname[i][1]);
        }
        System.out.println("=============");
        avg=sum/5;
        System.out.printf("JAVA成績平均 = %.1f\n",avg);
    }
    
}
