package com.basic;


	import java.util.HashSet;
	import java.util.Scanner;
	public class Notify {
	
	    public static int notInArray(int[] a, int K) {
	        // Step 1: Store all elements of the array in a HashSet for quick lookup
	        HashSet<Integer> set = new HashSet<>();
	        for (int num : a) {
	            set.add(num);
	        }

	        // Step 2: Start checking from K+1 and find the first number not in the set
	        int result = K + 1;
	        while (set.contains(result)) {
	            result++;
	        }

	        // Return the first number greater than K that is not in the array
	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input for the size of the array
	        int N = scanner.nextInt();
	        int[] A = new int[N];

	        // Input for the elements of the array
	        for (int i = 0; i < N; i++) {
	            A[i] = scanner.nextInt();
	        }

	        // Input for the value of K
	        int K = scanner.nextInt();

	        // Get the result from the notInArray method
	        int result = notInArray(A, K);

	        // Print the result
	        System.out.println(result);
	    }
	}


