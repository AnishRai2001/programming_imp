package programming.arrays;

public class LargestElement {

	public static int largestElement(int []arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		int []arr= {10,20,60,89};
		int largest=largestElement(arr);
		System.out.println(largest);
	}
}
