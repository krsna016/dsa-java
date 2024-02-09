// Minimum value in an array:
package _2_Arrays;

public class FindMinimumValue {
    public void print_array(int[] arr){
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public int minimum_ele_arr(int[] arr){
        int min = arr[0];
        for (int j:arr){
            if(j<min){
                min = j;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        FindMinimumValue ar7 = new FindMinimumValue();
        int[] arr = {1,7,0,5,-5,2,5,-7};
        ar7.print_array(arr);
        System.out.println(ar7.minimum_ele_arr(arr));
    }
}