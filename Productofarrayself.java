import java.util.Arrays;
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        int pre=1;
        int post=1;
        for(int i=0;i<nums.length;i++){
            result[i]=1;
        }
        for(int i=0;i<nums.length;i++){
            result[i]=result[i]*pre;
            pre=pre*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*post;
            post=post*nums[i];
        }
        return result;

    }
}
    public class Productofarrayself{
        public static void main(String args[]){
            int[] nums={1,2,3,4};
            Solution obj1=new Solution();
            int[] result=obj1.productExceptSelf(nums);
            System.out.println(Arrays.toString(result));
        }
        
    
}
