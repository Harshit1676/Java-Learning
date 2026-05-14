public class CommandLine {
    public static void main(String[] args ) {
        if(args.length == 0){
            System.out.println("No argument provided");
            return;
        }
        System.out.println("Number of argu: "+args.length);

        for(int i=0;i<args.length;i++){
            System.out.println("args[ "+i+" ]"+args[i]);
        }
    }    
}
