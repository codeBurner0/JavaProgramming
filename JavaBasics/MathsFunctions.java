package JavaBasics;
public class MathsFunctions{
	
	public static void main(String[] args) {
		System.out.println(Math.PI);		// 3.141592653589793
		System.out.println(Math.max(3, 5)); // 5
		System.out.println(Math.min(3, 5));	// 3
		System.out.println(Math.sqrt(4));	// 2.0
		int absoluteValue = Math.abs(5);  //converts -ve to +ve
		System.out.println(absoluteValue);	// 5   
		

		
		System.out.println(Math.sqrt(-1));	// NaN (Not A Number)
		System.out.println(0 / 0.0);		// NaN
		System.out.println((0 / 0.0) + 5);	// NaN
		
		System.out.println(5 / 0.0);		// Infinity
		System.out.println(-5 / 0.0);		// -Infinity
		
		System.out.println(Math.round(20.0 / 3.0));						// 7
		System.out.println(Math.round( 20.0 * 100.0 / 3.0) / 100.0);	// 6.67
		
		
	}

}