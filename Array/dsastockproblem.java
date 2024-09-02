// package Array;

public class dsastockproblem {

    public  static   void buyandsellstock(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofite=0;

        for(int i=0 ; i<price.length;i++){
            if(buyprice<price[i]){
                int profite=price[i]-buyprice;
                System.out.println("Todays profite"+profite);

                maxprofite=Math.max(profite,maxprofite);
            }else{
                buyprice=price[i];
            }

        }
        System.out.println("max profite "+maxprofite);



    }

    public static void main(String[] args) {

        int prices[]={6,3,8,6,1,4};

        buyandsellstock(prices);
    }

}
