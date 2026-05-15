import java.util.*;
public class PalindromeString {
    public static void main(String[] args){
        String str = "racecar";
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            System.out.println(str+" is Palindrome");
        }else{
            System.out.println(str+" is NOT Palindrome");
        }

        // Manual Method
        String s = "madam";
        boolean isPalin = true;
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                isPalin = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(s+(isPalin?" is":" is not")+" palindrome");
    }
}
