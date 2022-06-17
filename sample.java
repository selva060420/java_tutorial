package example;

import java.util.Scanner;

public class sample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the value: ");
    	int[] arr = new int[10];
    	for(int i=0;i<10;i++) {
    		arr[i] = scan.nextInt();
    	}
    	for(int i: arr) {
    		System.out.printf("%d",i);
    	}
	}
}
