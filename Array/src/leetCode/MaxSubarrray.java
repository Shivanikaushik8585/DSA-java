package leetCode;

public class MaxSubarrray {
public static int sum(int nums[]) {
	   int ms= Integer.MIN_VALUE;
       int cs =0;
       for(int i=0;i<nums.length;i++) {
    	   cs = cs+nums[i];
    	   if(cs<0) {
    		   cs= 0;
    	   }
    	   ms = Math.max(cs, ms);
       }
       return ms;
       
}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int nums[]= {-2,-3,4,-1,-2,1,5,-3};
		System.out.print(sum(nums));
		System.out.print(max(nums));
	}
}
