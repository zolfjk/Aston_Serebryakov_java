package aston;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a и нажмите Enter: ");
        int a = in.nextInt();
        System.out.println("Введите число b и нажмите Enter: ");
        int b = in.nextInt();
        in.close();

        Action action = new Action();
        action.presentation(a, b);
        action.compare(a, b);
        action.addition(a, b);
        action.subtraction(a, b);
        action.separation(a, b);
        action.multiplier(a, b);
    }
}