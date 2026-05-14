import java.util.*;
public class Association {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace(" ","");
        int vol = 0;
        int cons = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='o' ||str.charAt(i)=='O'  || str.charAt(i)=='u' || str.charAt(i)=='U' || str.charAt(i)=='i' || str.charAt(i)=='I'){
                vol++;
            }else{
                cons++;
            }
        }
        System.out.println(vol);
        System.out.println(cons);
    }
}
