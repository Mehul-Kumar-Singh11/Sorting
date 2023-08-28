import static swap_function.Swap_function.swap;
import java.util.Arrays;

public class Quick_Sort {

	public static void main(String[] args) {
		int[] a = {4,1,3,5,2};
	    int n = a.length;
	    System.out.println("Before sorting array: ");
	    System.out.println(Arrays.toString(a));
	    quick_sort(a,0,n-1);
	    System.out.println("After sorting: ");
	    System.out.println(Arrays.toString(a));
	}
	
	private static void quick_sort(int[] a,int low, int high) {
		  if(low < high) { // stop when only single element is present as already sorted
			  int partition_index = partition_func(a,low,high); // find pivot index
			  quick_sort(a,low,partition_index-1);
			  quick_sort(a,partition_index+1,high);
		  }
	}
	
	private static int partition_func(int[] a,int low,int high) {
		int pivot = low; // taking first element as pivot
		int i = low;
		int j = high;
		while(i<j) { // start iterating
			while(a[i] <= a[pivot] && i<=high-1) {//increment i until u don't find an element > pivot element 
				 i++;
			}
			while(a[j] > a[pivot] && i>=low+1) {//decrement j until u don't find an element < pivot element 
				j--;
			}
			if(i<j) { // swap so that smaller elements comes to left and larger elements to right
				swap(a,i,j);
			}
		}
		swap(a,pivot,j); // when i crosses j, swap pivot element with j index element
		return j; // at last return j as j index stores pivot element index
	}

}
