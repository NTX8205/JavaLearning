package 資料結構.教學;

import java.io.IOException;

class node_new {
    int data;
    int np;
    node_new next;
    public node_new(int data, int np){
        this.data = data;
        this.next = null;
        this.np = np;
    }
}

class list {
    public node_new first;
    public node_new last;

    public boolean isEmpty() {
        return first == null;
    }

    public void print() {
        node_new current = first;
        while (current != null) {
            System.out.println("[" + current.data + " " + current.np + "]");
            current = current.next;
        }
        System.out.println();
    }

    public void insert(int data, int np) {
        node_new node = new node_new(data, np);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }
}

public class nodes {
    public static void main(String[] args) throws IOException{
        
        int num=0;
        int data[] = new int[] {5, 7 , 9, 3, 8};
        list ll = new list();
        for (int i = 0; i < 5; i++) {
            num+=1;
            ll.insert(num, data[i]);
        }
        ll.print();
    }

}
