package aston;

public class Action {
    public void compare(int a, int b) {
        String result;
        if (a > b) {
            result = " > ";
        } else if (a < b) {
            result = " < ";
        } else {
            result = " = ";
        }
        System.out.println(a + result + b);
    }

    public void addition(int a, int b) {
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }

    public void subtraction(int a, int b) {
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }

    public void separation(int a, int b) {
        int result = a / b;
        System.out.println(a + " : " + b + " = " + result);
    }

    public void multiplier(int a, int b) {
        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }

    public void presentation(int a, int b) {
        System.out.println("Число a: " + a);
        System.out.println("Число b: " + b);
    }
}
