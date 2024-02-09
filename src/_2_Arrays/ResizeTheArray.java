// Resize an array in java:
package _2_Arrays;
public class ResizeTheArray {
    public void print_array(int[] arr){
        for (int i:arr){
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
    public int[] resize_array(int[] arr,int size){
        int[] temp = new int[size];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        ResizeTheArray ar10 = new ResizeTheArray();
        int[] array = new int[] {1,2,3,6,7,6};
        ar10.print_array(array);
        System.out.println("Size of array before : "+array.length);
        array = ar10.resize_array(array,10);
        ar10.print_array(array);
        System.out.println("Size of array after : "+array.length);
    }
}