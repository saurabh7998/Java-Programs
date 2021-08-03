package strings.pallindromeCheck;

import java.util.LinkedList;
import java.util.List;

public class ReverseWord {

	public static void main(String[] args) {

		String str = "Saurabh is great";
		reverseWords(str);
		System.out.println("");
		reverseWord1(str);

	}

	public static void reverseWords(String str) {

		String[] arr = str.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void reverseWord1(String str) {

		LinkedList<String> stack = new LinkedList<String>();

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(stack.pop() + " ");
		}

	}

}
