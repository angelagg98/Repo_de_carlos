package Taller6;

import java.util.Scanner;

public class Ciclos7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un valor para N: ");
        int N = scanner.nextInt();
        for(int i = 1; i<=N; i = i +1){
            System.out.println(i);
        }
        scanner.close();
    }
}
