package 資料結構.作業.範例.排序法;

//改良氣泡排序法

public class bubble_sort_better extends Object{
    
    int data[] = new int[]{4,6,2,7,8,9}; //原始資料

    public static void main(String[] args) {
        
        System.out.print("改良氣泡排序法\n原始資料為:");
        bubble_sort_better sort = new bubble_sort_better();
        sort.showdata();
        sort.bubble();
    }

    public void showdata() {

        for (int i=0;i<6;i++){
            System.out.print(data[i]+" ");
    
        }
        System.out.println();
    }

    public void bubble(){
        for(int i=5;i>=0;i--){

            int flag = 0;
            for(int j=0;j<i;j++){
                if(data[j+1]<data[j]){
                    int temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                    flag++;
                    
                }
            }
            if (flag==0){
                break;
            }

            /**
             * 當執行完一次掃描就判斷是否做過交換動作，如果沒有交換過資料
             * ，表示此時陣列已完成排序，顧可以跳出迴圈
             */

            System.out.print("第"+(6-i)+"次排序:");
            for (int j=0;j<6;j++){
                System.out.print(data[j]+" ");
            }
            System.out.println();
        
        }
        System.out.print("排序後的結果為:");
        showdata();
    }
}
