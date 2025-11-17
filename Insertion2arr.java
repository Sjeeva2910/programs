import java.util.Arrays;
import java.util.ArrayList;
class Insertion2arr {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i:nums1){
                arr1.add(i);
        }
        for(int i:nums2){
            if(arr1.contains(i)){
               arr2.add(i);
               arr1.remove((Integer)i);// ethukuna ipo 1,1,1,, two select pandrom meethi one ku pair vanga mudiyathu,,intersections pair kedacha store pantu remove pananum bec irntha maruka valuse varum
            }
        }
        int temp[]=new int[arr2.size()];
        for(int i=0;i<arr2.size();i++){
            temp[i]=arr2.get(i);
        }
        return temp;
    }

    public static void main(String args[]){
            Insertion2arr obj=new Insertion2arr();
            int nums1[]={1,2,2,1};
            int nums2[]={2,2};
            int result[]=obj.intersect(nums1,nums2);
            System.out.println(Arrays.toString(result));
        }
}

