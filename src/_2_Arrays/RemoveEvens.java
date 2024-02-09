// Removing Even Integers from and Array:
package _2_Arrays;

public class RemoveEvens {
    public void print_array(int[] arr){
        // We can use Enhanced for-loop as well:
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public void remove_even(int[] arr){
        int odd_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                odd_count ++;
            }
        }
        int[] odd_arr = new int[odd_count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                odd_arr[j] = arr[i];
                j++;
            }
        }
        print_array(odd_arr);
    }

    public static void main(String[] args) {

        RemoveEvens ar5 = new RemoveEvens();
        ar5.print_array(new int[] {4,6,8,44,66,32,767,8,97,54,33});
        ar5.remove_even(new int[] {4,6,8,44,66,32,767,8,97,54,33});
    }
}
