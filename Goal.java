public class Goal {
    public String interpret(String command) {
        command=command.replace("()","o");
        command=command.replace("(al)","al");
        return command;
    }
        public static void main(String args[]){
            String command="G()(al)";
            Goal obj=new Goal();
            String result=obj.interpret(command);
            System.out.println(result);
        }
}
    

