package _7_Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumbers {
    public static String[] generate_binary(int n){
        String[] str = new String[n];
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        for (int i = 0; i < n; i++) {
            str[i] = queue.poll();
            String s1 = str[i] + "0";
            String s2 = str[i] + "1";
            queue.offer(s1);
            queue.offer(s2);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'n' : ");
        int n = sc.nextInt();
        String[] result = generate_binary(n);
        for(String i:result){
            System.out.print(i + " ");
        }
    }
}