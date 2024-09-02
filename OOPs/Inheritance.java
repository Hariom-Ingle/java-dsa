package OOPs;

import javax.xml.namespace.QName;

public class Inheritance {
    public static void main(String[] args) {

        Fish shark= new Fish();
        shark.eat();

     }
}

class Animal {
    String name;

     void eat (){

         System.out.println("Eat...");
     }
}

class  Fish extends  Animal{

    void  swim(){
        System.out.println("Swim ...");
    }
}
