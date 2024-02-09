package _1_TimeComplexity;// TimeComplexity:
import java.lang.*;
public class TimeComplexity_1 {
    public int find_sum_n_1(int n){
        return n*(n+1)/2;
    }
    public int find_sum_n_2(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {

        TimeComplexity_1 tc = new TimeComplexity_1();

        double current_t1 = System.currentTimeMillis();
        tc.find_sum_n_1(9999);
        System.out.println("Time Taken using 'find_sum_n_1' = "+ (System.currentTimeMillis()-current_t1) +" Milli seconds.");


        double current_t2 = System.currentTimeMillis();
        tc.find_sum_n_2(99999);
        System.out.println("Time Taken using 'find_sum_n_2' = "+(System.currentTimeMillis()-current_t2) +" Milli seconds.");
    }
}