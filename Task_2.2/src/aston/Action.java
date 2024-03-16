package aston;

public class Action {
    public void compare(String textA, String textB) {
        if (textA.equals(textB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
