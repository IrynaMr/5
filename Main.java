//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Вік менше 18 років! Реєстрація неможлива");
        }
        System.out.println("Вік 18+: реєстрація можлива");
    }
    public static void main(String[] args) {
        try {
            validateAge(20);
            validateAge(16);
        } catch (CustomException exception) {
            System.out.println("Виняток: " + exception.getMessage());
        }
    }
}