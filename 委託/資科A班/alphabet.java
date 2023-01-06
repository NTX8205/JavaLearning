package 委託.資科A班;

public class alphabet {

    public static void main(String[] args) {
        char c=64; //ASCII碼轉英文

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                c++;
                System.out.print(c);
            }
            System.out.println();
        }
    }
    
}
