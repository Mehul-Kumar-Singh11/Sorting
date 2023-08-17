import static swap_function.Swap_function.swap;
import java.util.Arrays;
public class Insertion_sort {
  
	 public static void sort(int[] a,int n) {
		 for(int i=0;i<=n-2;i++) {
			 for(int j=i+1;j<n;j++) {
				 if(a[i] > a[j]) {
					 swap(a,i,j);
				 }
			 }
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
