package inclassProject;

import java.util.Scanner;

public class LastIndexOf {
	public static void main(String[] args) {
		int[] num = { 1, 18, 2, 7, 18, 39, 18, 40 }; //array list
		
		
		Scanner console = new Scanner(System.in); //input
		
		
		System.out.println("Enter the value ?");
		System.out.println("The index is :" + lastIndexOf(num, console.nextInt()));
	}

	public static int lastIndexOf(int[] num, int value) { 
		boolean b = false;
		int position = 0;
		for (int i = 0; i < num.length; i++) {

			if (value == num[i]) {  //checks if the value is on the list, returns index
				position = i;
				b = true;

			}

		}
		if (b == true)
			return position; //checks if the value is on the list, if value not found it returns -1
		else
			return -1;

	}
}
