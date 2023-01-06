package 資料結構.教學;

import java.io.IOException;
import java.util.Random;

class Node {
    int data;
    int np;
    String names;
    Node next;

    public Node(int data, String names, int np){
        this.np = np;
        this.names = names;
        this.data = data;
        this.next = null;
    }
}

class StuLinkedList {
    public Node first;
    public Node last;

    public boolean isEmpty(){
        return first == null;
    }

    public void print(){
        Node current = first;
        while(current != null) {
            System.out.println("[" + current.data + " " + current.names + " " + current.np + "]");
            current = current.next;
        }
    }

    public void insert(int data, String names, int np){
        Node newNode = new Node(data, names, np);
        if(isEmpty()){
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public void delete(Node delNode){
        Node newNode;
        Node tmp;
        if(first.data == delNode.data){
            first = first.next;
        } else if (last.data == delNode.data){
            System.out.println("I am here !\n");
            newNode = first;
            while (newNode.next != last)
                newNode = newNode.next;
            newNode.next = last.next;
            last = newNode;
        } else {
            newNode = first;
            tmp = first;
            while(newNode.data != delNode.data) {
                tmp = newNode;
                newNode = newNode.next;
            }
            tmp.next = delNode.next;
        }
        
    }
}

class ReverseStuLinkedList extends StuLinkedList {
    public void reverse_print() {
        Node current = first;
        Node before = null;
        System.out.println("反串後陣列資料");
        while (current != null) {
            last = before;
            before = current;
            current = current.next;
            before.next = last;
        }
        current = before;
        while (current != null) {
            System.out.println("[" + current.data + " " + current.names + " " + current.np + "]");
            current = current.next;
            System.out.println();
        }
    }
}

public class linkedlist{

    public static void main(String[] args) throws IOException{
        Random rand = new Random();
        ReverseStuLinkedList list = new ReverseStuLinkedList();
        int i,j,data[][] = new int[12][10];
        String name[] = new String[] {"Allen", "Scott", "Marry", "Jon", "Mark", "Ricky", "Lisa", "Janice", "Hanson", "Amy", "Bob", "Jack"};
        System.out.println("座號成績座號成績座號成績座號成績\n ");
        for (i = 0; i < 12; i++) {
            data[i][0] = i + 1;
            data[i][1] = (Math.abs(rand.nextInt(50))) + 50;
            list.insert(data[i][0], name[i], data[i][1]);
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("[" + data[j * 3 + i][0] + "]  [" + data[j * 3 + i][1] + "] ");
            }
            System.out.println();
        }
        list.reverse_print();
    }
}
