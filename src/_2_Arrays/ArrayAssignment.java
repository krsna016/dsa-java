package _2_Arrays;

public class ArrayAssignment {
    public void print_array(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
    public void demo_array(){
        int[] arr_ = new int[5];
        System.out.println("Array before Assignment : ");
        print_array(arr_);
        arr_[0] = 1;
        arr_[1] = 2;
        arr_[2] = 3;
        arr_[3] = 4;
        arr_[4] = 5;
        // arr_[5] = 6; // Give- java.lang.ArrayIndexOutOfBoundException
        System.out.println("Array after Assignment : ");
        print_array(arr_);

        System.out.println(arr_.length); // Printing size of array
        System.out.println(arr_[arr_.length -1]); // Printing last element
        int[] arr__ = {2,4,6,8,0}; // Other way
        print_array(arr__);
    }
    public static void main(String[] args) {
        ArrayAssignment ar3 = new ArrayAssignment();
        ar3.demo_array();
    }
}
