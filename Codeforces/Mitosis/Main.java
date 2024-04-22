package Codeforces.Mitosis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        int c = sn.nextInt();
        System.out.println((a + b) == c ? "YES" : "NO");
        sn.close();
    }
}
