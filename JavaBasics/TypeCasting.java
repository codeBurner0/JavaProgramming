package JavaBasics;

public class TypeCasting {
    public static void main(String[] args) {

    // implicit typecasting
        // int --> double
        System.out.println(" int --> double ");
        int a=12;
        double d = a;
        System.out.println(d);

        // short --> int
        System.out.println(" short --> int ");
        short s=233;
        int b=s;
        System.out.println(b);


        // byte to short 
        System.out.println(" byte to short ");
        byte c= 34;
        short s1=c;
        System.out.println(s1);

        // int to float
        System.out.println(" int to float ");
        int i1=345;
        float f=i1;
        System.out.println(f);

    // explicit typecasting
         // double --> int
         System.out.println(" double --> int ");
         double d3 = 345.897;
         int a2=(int)d3;
         System.out.println(a2);

         // int --> short
         System.out.println(" int --> short ");
         int b2=45678;
         short s2=(short)b;
         System.out.println(s2);

         // short --> byte
         System.out.println(" short --> byte ");
         short s3=567;
         byte c3= (byte)s1;
         System.out.println(c3);

         // float --> int
         System.out.println(" float --> int");
         float f2=56.90f;
         int i4=(int)f2;    
         System.out.println(i4);

         

        



    }
    
}
