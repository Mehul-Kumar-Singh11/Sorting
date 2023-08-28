import java.util.Arrays;
public class Merge_Sort {

	public static void main(String[] args) {
    int[] a = {4,1,3,5,2};
    int n = a.length;
    System.out.println("Before sorting array: ");
    System.out.println(Arrays.toString(a));
    merge_sort(a,0,n-1);
    System.out.println("After sorting: ");
    System.out.println(Arrays.toString(a));
	}
	
	private static void merge_sort(int[] a,int low,int high) {
		// divide 
		if(low == high) {
			return;
		}
		int mid = low + (high - low) / 2;
		merge_sort(a,low,mid);
		merge_sort(a,mid+1,high);
		merge(a,low,mid,high);
		}
	
	private static void merge(int[] a,int low,int mid,int high) {
		int n = high-low+1;
		int[] temp = new int[n];
		int i=low;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=high) {
			if(a[i]<a[j]) {
				temp[k] = a[i];
				i++;
			}
			else {
				temp[k] = a[j];
				j++;
			}
			k++;
		}
		while(i<=mid) {
			temp[k] = a[i];
			i++;
			k++;
		}
		while(j<=high) {
			temp[k] = a[j];
			j++;
			k++;
		}  
//		System.out.println(Arrays.toString(temp));
		for(k=0;k<n;k++) {
			a[low+k] = temp[k];
		}
	}
}
