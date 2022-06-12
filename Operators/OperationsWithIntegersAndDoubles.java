package Operators;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationsWithIntegersAndDoubles {
	
	public static void main(String[] args) {
		int i = 20;
		System.out.println(i / 3);				// 6
		System.out.println(i - (6 * 3));		// 2
		System.out.println((double)i / 3);		// 6.666666666666667
//		
	    BigDecimal bd1 = BigDecimal.valueOf(20).setScale(2);
       
		BigDecimal val = BigDecimal.valueOf(3);
		BigDecimal chargePerPerson = bd1.divide(val, RoundingMode.HALF_UP);
		System.out.println(chargePerPerson);	// 6.67

        // OR
        double d=(double)i / 3;
        System.out.println(d);
        double two=Math.round(d*100);
        System.out.println(two/100);

        // Or	
		double d1 = 3.1;
		double d2 = 1.21;
//		
		System.out.println(d1 - d2);				// 1.8900000000000001
//		
		BigDecimal bd3 = BigDecimal.valueOf(3.1).setScale(2);
		BigDecimal bd4 = BigDecimal.valueOf(1.21).setScale(2);
		System.out.println(bd3.subtract(bd4));			// 1.89
		
	}

}