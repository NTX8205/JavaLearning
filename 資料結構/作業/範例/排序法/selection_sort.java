package 資料結構.作業.範例.排序法;

public class selection_sort extends Object{
    
    int data[]=new int[]{9,7,5,3,4,6};
    public static void main(String[] args) {
        
        System.out.print("原始資料為:");
        selection_sort sort = new selection_sort();
        sort.showdata();
        sort.select();
    }

    void showdata(){

        for (int i=0;i<6;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    void select(){
        for (int i=0;i<5;i++){
            for(int j=i+1;j<6;j++){
                if(data[i]>data[j]){
                    int temp = data[i];
                    data[i]=data[j];
                    data[j]=temp;
                }
            }
            System.out.print("第" + (i + 1) + "次排序結果:");
            for (int k = 0; k < 6; k++) {
                System.out.print(data[k] + " ");
            }
            System.out.println();
        }
        System.out.println();
        

    }
}
