package leetCode;

public class Sum {
	public static int sum(int a[] ,int n) {
		int min=  Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<n;i++) {
			min= Math.min(min, a[i]);
			max= Math.max(max, a[i]);
			
		}
		System.out.println(max);
		sum= max+min;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3, 5, 4, 1, 9};
		System.out.print(sum(a,5));
		

	}

}
