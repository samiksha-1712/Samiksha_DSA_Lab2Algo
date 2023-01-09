package com.greatlearning.dsa.labsession2;

import java.util.Scanner;

public class PayMoneyTransaction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int transactionSize, NoOfTargets, targetValue;

		System.out.println("Enter the size of transaction array: ");
		transactionSize = sc.nextInt();

		int transactionArray[] = new int[transactionSize];
		System.out.println("Enter the values of array: ");
		for (int i = 0; i < transactionSize; i++)
			transactionArray[i] = sc.nextInt();

		System.out.println("Enter the total no. of targets that needs to be achieved: ");
		NoOfTargets = sc.nextInt();

		// for (int j = 0; j < NoOfTargets; j++) {
		while (NoOfTargets-- != 0) {
			System.out.println("Enter target value: ");
			targetValue = sc.nextInt();

			int sum = 0;
			int flag = 0;

			for (int i = 0; i < transactionSize; i++) {
				sum = sum + transactionArray[i];
				if (sum >= targetValue) {
					System.out.println("Target achieved after " + (i + 1) + " transactions\n");
					flag = 1;
					break;
				}
			}

			if (flag == 0)
				System.out.println("Given target is not achieved.");
		}
	}

}
