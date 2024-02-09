// Finding missing number in an array:
// (Given an array of n-1 distinct numbers from 1 to n : we need to find the missing number)
package _2_Arrays;
public class FindMissingNumber {
    public int missing_num(int[] array){
        int size = array.length + 1;
        int sum = ((size)*(size+1))/2;
        for (int i:array){
            sum = sum - i;
        }
        return sum;
    }
    public static void main(String[] args) {
        FindMissingNumber fmn = new FindMissingNumber();
        System.out.print("The missing number is : ");
        System.out.println(fmn.missing_num(new int[] {1,2,4,5,6,7}));
    }
}