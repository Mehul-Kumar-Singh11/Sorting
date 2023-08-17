package swap_function;

public class Swap_function {

	public static void main(String[] args) {

	}

	public static void swap(int[] a,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
