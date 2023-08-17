import static swap_function.Swap_function.swap;

import java.util.Arrays;

public class Selection_sort{
	public static void sort(int[] a, int n) {
		// transverse the array and find minimum
		int j  = 0;
		while(j<=n-2) {
		int min = j;
		for(int i=j+1;i<n;i++) {
			if(a[i] < a[min]) {
				min = i;
			}
		}
		// now we have min value, put it in correct place
		swap(a,min,j);
		j++;
		}
	}
	
	public static void main(String[] args) {
		int[] a = {13,9,24,52,20,9};
		int n = a.length;
		System.out.println(Arrays.toString(a));
		sort(a,n);
		System.out.println(Arrays.toString(a));

	}
}