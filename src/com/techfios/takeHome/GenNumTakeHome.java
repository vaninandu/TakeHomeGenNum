package com.techfios.takeHome;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenNumTakeHome {
	static int[] genList = new int[500];

	public static void gen() {
		Random rand = new Random();

		for (int i = 0; i < 500; i++) {

			int genNum = rand.nextInt(1000);

			genList[i] = genNum;
		}
		Arrays.sort(genList);
	}

	public static void main(String[] args) {

		gen();
		for (int n : genList) {
			System.out.println(n);

		}

		Scanner ui = new Scanner(System.in);

		System.out.println("Enter the Nth smallest number ");
		int n = ui.nextInt();
		System.out.println("The " + n + "th smallest number is: " + genList[n - 1]);
	}
}


