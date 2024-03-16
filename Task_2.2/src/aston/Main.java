package aston;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку a и нажмите Enter: ");
        String textA = in.nextLine();
        System.out.println("Введите строку b и нажмите Enter: ");
        String textB = in.nextLine();
        in.close();

        Action action = new Action();
        action.compare(textA, textB);
    }
}