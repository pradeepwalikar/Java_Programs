package  DSA.Sorting_Algorithms;

public class Insertion_Sort {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 1, 3, 2 };
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i], j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
