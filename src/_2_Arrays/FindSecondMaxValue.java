// Finding second maximum value in array:
package _2_Arrays;
public class FindSecondMaxValue {
    public int find_2nd_max(int[] arr){
        if(arr == null || arr.length == 0 || arr.length == 1){
            throw new IllegalArgumentException("Invalid Input");
        }
        int max = Integer.MIN_VALUE;
        int max_2nd = Integer.MIN_VALUE;
        for(int i : arr){
            if(max < i){
                max_2nd = max;
                max = i;
            }
            else if(max_2nd < i && i != max){
                max_2nd = i;
            }
        }
        return max_2nd;
    }
    public static void main(String[] args) {
        FindSecondMaxValue ar8 = new FindSecondMaxValue();
        System.out.print("The 2nd max value is : ");
        System.out.println(ar8.find_2nd_max(new int[] {1,2,3,3,6,5,7,8,8}));
        System.out.println(ar8.find_2nd_max(null)); // gives Exception - IllegalArgumentException("Invalid Input")

    }
}