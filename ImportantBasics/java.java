package ImportantBasics;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] n1= new int[n];
        // char[] c=new char[n];
        String s="";
        for(int i=0;i<n;i++){
            n1[i]=sc.nextInt();
            String s1=Integer.toString(n1[i]);
            s=s+s1;
        }
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
// System.out.println(s.length());    }
    }
}
