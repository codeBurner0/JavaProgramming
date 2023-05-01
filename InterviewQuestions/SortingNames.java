package InterviewQuestions;

import java.util.Scanner;

public class SortingNames {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String arr[] = new String[N];
        // taking input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (String e : arr) {
            System.out.print(e + " ");
        }

    }
}

// Input:- Banana Grapes Apple
// Output:- Apple Banana Apple