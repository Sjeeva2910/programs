public class Excelcolunm {
    public String convertToTitle(int columnNumber) {
        String result="";
        int n=columnNumber;
        while(n>0){
            n=n-1;
            int rem=n%26;
            char c=(char)('A'+rem);
            result=c+result;  ///front la add pandrom
            n=n/26;      
        }
        return result;
    }
        public static void main(String args[]){
            int columnNumber=26;
            Excelcolunm obj=new Excelcolunm();
            String result=obj.convertToTitle(columnNumber);
            System.out.println(result);
        }
    
}
