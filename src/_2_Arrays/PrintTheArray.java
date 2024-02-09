package _2_Arrays;

public class PrintTheArray {
    public void print_array(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        PrintTheArray ar4 = new PrintTheArray();
        int[] arr = {1,2,34,5,66};
        ar4.print_array(arr);

        // We can Even create an array in this way as well:
        ar4.print_array(new int[] {4,5,6,7,8});

        }
}

