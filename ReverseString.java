class Solution{
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}
public class ReverseString{
        public static void main(String args[]){
            Solution obj=new Solution();
            char s[]={'h','e','l','l','o'};
            obj.reverseString(s);
            for(int i=0;i<s.length;i++){
                System.out.print(s[i]);
            }

        }
        
    
}
    

