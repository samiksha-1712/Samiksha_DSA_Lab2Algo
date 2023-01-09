package com.greatlearning.dsa.labsession2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MergeSort mergeSort = new MergeSort();
		NotesCount notesCount = new NotesCount();

		System.out.println("Enter the size of currency denomination: ");
		int size = sc.nextInt();
		int notes[] = new int[size];
		System.out.println("Enter the currency denomination value: ");
		for (int i = 0; i < size; i++)
			notes[i] = sc.nextInt();
		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();
		mergeSort.sort(notes, 0, notes.length - 1);
		mergeSort.printArray(notes);
		notesCount.notesCountImplementation(notes, amount);
	}

}
