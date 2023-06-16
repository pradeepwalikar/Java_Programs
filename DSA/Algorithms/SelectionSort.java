package DSA.Algorithms;

public class SelectionSort {
    public static void main(String[] args) 
    {
        int a[] = { 4, 5, 2, 1, 3 };
		for (int j = 0; j < a.length; j++) 
        {
			int min = j;
			for (int i = j + 1; i < a.length; i++)
            {
				if (a[i] < a[min])
                {
					min = i;
				}
			}
			if (min != j) 
            {
				int temp = a[j];
				a[j] = a[min];
				a[min] = temp;
			}
		}
		for (int j = 0; j < a.length; j++) 
        {
			System.out.print(a[j] + " ");
		}

    }
}
