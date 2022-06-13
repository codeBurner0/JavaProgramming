package ImportantBasics;

public class Randomnumbers{
    public static void main(String[] args) {

        double ran=Math.random();
        System.out.println(ran);// generate random numbers between 0.0 to 1.0

        int ran1=(int)Math.round(Math.random()*10);
        System.out.println(ran1);// generate random number between 0 to 10

        int ran3=(int)Math.round(Math.random()*100);
        System.out.println(ran3);// generate random number between 0 to 100

        int ran2=(int)Math.round((Math.random()*100)+100);
        System.out.println(ran2);// generate random number between 100 to 200

    }
}
