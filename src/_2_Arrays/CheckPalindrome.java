package _2_Arrays;
public class CheckPalindrome {
    public boolean check_palindrome(String str){
        char[] arr = str.toCharArray();
        int start_i = 0;
        int end_i = arr.length-1;
        while (start_i<end_i){
            if(arr[start_i] != arr[end_i]){
                return false;
            }
            else {
                start_i ++;
                end_i --;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        CheckPalindrome cps = new CheckPalindrome();
        boolean is_palindrome = cps.check_palindrome("sir");
        if(is_palindrome){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        }
    }
}