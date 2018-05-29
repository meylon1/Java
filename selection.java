package inclassProject;

public class Selection {

	// selecting largest element in each iteration
	
	public static void selectionSort(int a[]) {

		for (int i = a.length - 1; i > 0; i--) {
			int maxx = i;
			for (int j = i - 1; j >= 0; j--) {     			// O(n^2)
				if (a[j] > a[maxx])
					maxx = j;
			}

			// swapping
			int temp = a[i];
			a[i] = a[maxx];
			a[maxx] = temp;
		}
	}

	public static void main(String[] args) {

		int arr1[] = { 26, 18, 7, 82, 58, 37, 91, 49, 100, 65 };
		int arr2[] = { 88, 68, 71, 12, 28, 37, 21, 49, 10, 65 };
		int arr3[] = { 108, 92, 5, 29, 62, 42, 8, 73, 23, 65 };

		selectionSort(arr1); 						   // it will not be faster.
		selectionSort(arr2);
		selectionSort(arr3);

		for (int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + " ");
		System.out.println();

		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
		
		for (int i = 0; i < arr3.length; i++)
			System.out.print(arr3[i] + " ");
		System.out.println();

	}
}


