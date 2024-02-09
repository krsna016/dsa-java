package _2_Arrays;
public class MoveZerosToEnd {
    public  void print_arr(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public void move_zeros(int[] arr) {
        int j = 0; // Pointer to 0th elements
        int i = 0; // Pointer to Other elements
        for (i = 0; i < arr.length; i++) {
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        print_arr(arr);
    }
    public static void main(String[] args) {
        MoveZerosToEnd ar9 = new MoveZerosToEnd();
        ar9.move_zeros(new int[] {1,8,0,7,0,6,9,7});
    }
}