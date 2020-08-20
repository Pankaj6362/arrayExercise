package com.simplilearn.arrayEx;

import java.util.Scanner;

public class arrayExerciseOne {

	public static void main(String[] args) {
		
		String [] groceryStore= {"Salt", "Sugar", "Milk", "Onion", "Eggs"};
		
		System.out.println("Welcome to grocery store");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What do you want from our store :");
		
		String inpGro = input.nextLine();
		
		int count = 0;
		for (int index = 0 ; index<groceryStore.length ; index++) {
			if (groceryStore[index].equals(inpGro)) {
				System.out.println("We have this product");
				count=1;
			}
		}
		if (count <= 0) {
			System.out.println("we dont have this product ");
		}
	}

}
