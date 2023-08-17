import static swap_function.Swap_function.swap;
import java.util.Arrays;

public class Bubble_sort{
	public static void sort(int[] a,int n) {
		boolean swapped = false;
		for(int i=0;i<=n-2;i++) {
			swapped = false;
			for(int j=0;j<n-i-1;j++) {
				if(a[j] > a[j+1]) {
					swap(a,j,j+1);
					swapped = true;
				}
			}
			if(swapped == false) {
				return;
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {13,90,24,52,20,9};
		int n = a.length;
		System.out.println(Arrays.toString(a));
		sort(a,n);
		System.out.println(Arrays.toString(a));
	}
}