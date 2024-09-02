package OOPs;

public class gettersetter {
    public static void main(String[] args) {

        Car c1 =new Car();

        c1.setColor("blue");
        System.out.println(c1.getColor());

    }


}

 class Car{

    private String color ;
    private int speed;

       String getColor(){
          return this.color;
       }
       void  setColor(String color){
           this.color=color;
       }

 }
