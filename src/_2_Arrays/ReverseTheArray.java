// Reversing and Array:
package _2_Arrays;

public class ReverseTheArray {
    public void print_array(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }
    public void array_reverse(int[] arr,int start_i,int end_i){
        while (start_i<end_i){
            int temp = arr[start_i];
            arr[start_i] = arr[end_i];
            arr[end_i] = temp;
            start_i ++;
            end_i --;
        }
        print_array(arr);
    }
    public static void main(String[] args) {
        ReverseTheArray ar6 = new ReverseTheArray();
        int[] arr = {1,2,3,4,5,6,7};
        ar6.print_array(arr);
        ar6.array_reverse(arr,0,arr.length-1);
    }
}
