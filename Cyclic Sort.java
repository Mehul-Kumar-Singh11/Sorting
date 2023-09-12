
import java.util.*;

public class cyclic_Sort{
	
	public static void cycleSort(int arr[], int n)
	{
		
		int writes = 0;

		for (int cycle_start = 0; cycle_start <= n - 2; cycle_start++) {
			
			int item = arr[cycle_start];

			
			int pos = cycle_start;
			for (int i = cycle_start + 1; i < n; i++)
				if (arr[i] < item)
					pos++;

			
			if (pos == cycle_start)
				continue;

			
			while (item == arr[pos])
				pos += 1;

			
			if (pos != cycle_start) {
				int temp = item;
				item = arr[pos];
				arr[pos] = temp;
				writes++;
			}

			// Rotate rest of the cycle
			while (pos != cycle_start) {
				pos = cycle_start;

				// Find position where we put the element
				for (int i = cycle_start + 1; i < n; i++)
					if (arr[i] < item)
						pos += 1;

				// ignore all duplicate elements
				while (item == arr[pos])
					pos += 1;

				// put the item to it's right position
				if (item != arr[pos]) {
					int temp = item;
					item = arr[pos];
					arr[pos] = temp;
					writes++;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 8, 3, 9, 10, 10, 2, 4 };
		int n = arr.length;
		cycleSort(arr, n);

		System.out.println("After sort : ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}

