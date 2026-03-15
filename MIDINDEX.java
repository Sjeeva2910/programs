import java.util.*;

public class MIDINDEX {

    public static int findMiddleIndex(int[] nums) {

        int total = 0;

        for(int n : nums){
            total += n;
        }

        int left = 0;

        for(int i = 0; i < nums.length; i++){

            if(2 * left + nums[i] == total){
                return i;
            }

            left += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        int nums[] = {2,3,-1,8,4};

        int result = findMiddleIndex(nums);

        System.out.println("Middle Index = " + result);
    }
}