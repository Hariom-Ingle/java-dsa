package OOPs;

public class Classexample {

    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("yellow");
        System.out.println(p1.color);

    }
}

 class Pen{
    int tip =5;
    String color;

      void setColor( String newcolor){
         color=newcolor;

     }
     void setTip(int newtip){
          tip= newtip;
     }
}