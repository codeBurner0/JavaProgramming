package JavaBasics;
import java.util.Arrays;


public class Array {
	
	public static void main(String[] args) {
		int[] arr;//declaration
		int arr2[];
		
		arr = new int[10];//craetion
        arr[0]=12;//initialization
		System.out.println(arr.length);
		System.out.println(arr[0]);
		
		double[] arr3 = new double[10];
		System.out.println(arr3[0]);
		
		boolean[] arr4 = new boolean[10];
		System.out.println(arr4[0]);
		
		// System.out.println(arr4[10]); index out of bound exception
		
		int[] arr5 = {3, 2, 1};  
		
		int[][] matrix = {  //2D Array
				{1, 2, 3},
				{4, 5, 6}
		};

		int[][] arr6=new int[3][];//declaration and creation
		arr6[0]=new int[3];
		arr6[1]=new int[2];
		arr6[2]=new int[3];

		for(int i=0;i<arr6.length;i++){   // print 2d array element
			for(int j=0;j<arr6[i].length;j++){
				System.out.print(arr6[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println(matrix[0][2]);
		
		int[][] matrix2 = new int[10][10];
		System.out.println(matrix2[0]);
		
		System.out.println(Arrays.toString(arr5));// methos to print array
		Arrays.sort(arr5);// method to sort array elements 
		System.out.println(Arrays.toString(arr5));
	}


}
