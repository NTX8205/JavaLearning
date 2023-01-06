package 委託.資科B班111期末;

/*
 * 題目 5: 物件導向 (20%)
 * 說明: 有四個類別(class)，Animal, Dog, Cat, main，請回答下列問題:
 * 
 * class Animal{
 *      Animal(){}
 *      void talk(){
 *          System.out.println(“Animal talk”);
 *      }
 * } 
 * class Dog extends Animal{
 *      Dog(){}
 *      void talk(){
 *          System.out.println(“Dog talk”);
 *      }
 * }
 * class Cat extends Animal{
 *      Cat(){}
 *      void talk(){ 
 *          System.out.println(“Cat talk”);
 *      }
 * }
 * public class main{
 *      static void move_Animal(Animal obj){
 *          obj.move();
 *      }
 *      public static void main(){
 *          Animal a = new Animal();
 *          Dog b = new Dog();
 *          Cat c = new Cat();
 *          Animal d = new Dog();
 *          move_Animal (a);
 *          move_Animal (b);
 *          move_Animal (c);
 *          move_Animal (d);
 *      }
 * }
 * 
 * 問題 1: 上面執行結果為何?
 * A : Animal talk
 *     Dog talk
 *     Cat talk
 *     Dog talk
 * 問題 2: Animal d = new Dog(); 這段程式碼是什麼意思，請說明?
 * A : 新增一個Animal的物件d，其型態為Dog。
 */

public class Q5 {
    //因為沒有move的方法用，因此將其改為talk。
    public static void talk_Animal(Animal obj) {
        obj.talk();
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog b = new Dog();
        Cat c = new Cat();
        Animal d = new Dog();
        talk_Animal (a);
        talk_Animal (b);
        talk_Animal (c);
        talk_Animal (d);
        
    }
}

class Animal {
    public Animal (){

    }

    public void talk() {
        System.out.println("Animal talk");
    }
}

class Dog extends Animal {
    public Dog (){

    }

    public void talk() {
        System.out.println("Dog talk");
    }
}

class Cat extends Animal {
    public Cat (){

    }

    public void talk() {
        System.out.println("Cat talk");
    }
}
