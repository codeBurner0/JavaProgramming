package JavaBasics;
 
 class Primitive{
    public static void main(String[] args) {

      // 1.Integer datatypes
        int a=87;
        byte b=1; 
        short s;//initialization
        s=23;//declarartion
        long l=2_000_000_000_000l;
        System.out.println("Integer Datatypes -->  "+a+" "+b+" "+s+" "+l);

        // 2.variable datatype
        var v=34;// it auto recognise the datatype .
        var cq=true;
        System.out.println("variable Datatypes -->  "+v+" "+cq);

        // 3.character datatype
        char c='7'; 
        System.out.println("Character Datatypes -->  "+c);

        // 4.floating point numbers
        float f=34.9863f;
        double d=324.44;
        System.out.println("floating Datatypes -->  "+f+" "+d);

        //5. boolean datatype
        boolean bool =true;
        System.out.println("boolean Datatypes -->  "+bool);
    }
}