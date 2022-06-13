package ImportantBasics;

public class ExpressionType{

	public static void main(String[] args) {
		byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1;

		float f = 1.0F;
		double d = 1.0;

		char c = 1;

		int intExpressionType = b + b;
		int intExpressionType2 = s + s;
		int intExpressionType3 = b + i + c; //greatest is int .so use int datatype to store 

		long longExpressionType = i + l;

		float floatExpressionType = l + f;

		double doubleExpressionType = f + d;

		System.out.println(10 / 3); // 3
		System.out.println(10.0 / 3); // 3.3333333333333335

		System.out.println("Hello " + 1+3); // Hello 1   if string occur first then always treated as a string output
		System.out.println(1+2+"Hello");//3Hello  
		System.out.println("Hello " + null); // Hello null

	}

}
