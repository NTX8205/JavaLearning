package 資料結構.作業.範例.排序法;

//氣泡排序法

public class bubble_sort extends Object{
    

    public static void main(String[] args) {
        
        int i,j,tmp;
        int data[]={6,5,9,7,2,8};//原始資料
        System.out.println("氣泡排序法: ");
        System.out.print("原始資料為:");
        for(i=0;i<6;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
        for(i=5;i>0;i--){
            for(j=0;j<i;j++){
                if(data[j]>data[j+1]){

                    tmp = data[j];
                    data[j]=data[j+1];
                    data[j+1]=tmp;
                }
            }
            System.out.print("第"+(6-i)+"次排序的結果是: ");
            for(j=0;j<6;j++){
                System.out.print(data[j]+" ");
            }
            System.out.println();
        }
        

        System.out.println("排序後結果為: ");
        for(i=0;i<6;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();

    }
    
    
}
