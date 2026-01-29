class Solution {
    public String reverseWords(String s) {
        String result="";
        String words[]=s.split(" ");
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String rev="";
            for(int j=word.length()-1;j>=0;j--){
                rev=rev+word.charAt(j);
            }
            result=result+rev;
            if(i<words.length-1){
                result=result+" ";
            }          
        }
        return result;
    }
}
public class Reverse3{
      public static void main(String args[]){
            Solution obj=new Solution();
            String s="I will place";
            String result=obj.reverseWords(s);
            System.out.println(result);
        }    
}