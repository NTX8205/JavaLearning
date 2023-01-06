package 資料結構.作業.範例.排序法;


public class insert_sort extends Object{
    
    int data[]=new int[100000];
    int size=100000;
    public static void main(String[] args) {
        
        insert_sort sort = new insert_sort();
        sort.inputarr();
        System.out.print("您輸入的原始陣列是:");
        sort.showdata();
        sort.insert();
    }

    void inputarr(){
        for (int i=0;i<size;i++){
            data[i]=(int)(Math.random()*100)+1;
        }
    }

    void showdata(){

        for (int i=0;i<size;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    void insert(){

        int i;
        int j;
        int temp;
        for(i=1;i<size;i++){

            temp=data[i];
            j = i-1;
            while (j>=0 && temp<data[j]){
                data[j+1]=data[j];
                j--;
                
            }
            data[j+1]=temp;
            // System.out.print("第" + i + "次掃描:");
        } 
        showdata();
    }
}
