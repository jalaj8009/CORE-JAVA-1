package com.rays.javastring;

public class CountEachCharacter {
	public static void main(String[] args) {

		String name = "naman";
		int count = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {

			for (int j = 0; j < name.length(); j++) {

				if (ch == name.charAt(j)) {

					count++;

				}

			}

			if (count > 0) {

				System.out.println(ch + " = " + count);

				count = 0;

			}

		}

	}
}