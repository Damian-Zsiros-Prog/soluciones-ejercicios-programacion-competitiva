package Codeforces.NeutralNetwork;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        ArrayList<Integer> cantNodes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int cant = sn.nextInt();
            cantNodes.add(cant);
        }
        int sum = 0;
        for (int i = 1; i <= cantNodes.size() - 1; i++) {
            sum += cantNodes.get(i - 1) * cantNodes.get(i);
        }

        System.out.println(sum);
        sn.close();
    }
}
