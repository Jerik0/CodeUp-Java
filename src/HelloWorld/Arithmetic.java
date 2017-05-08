package HelloWorld;

public class Arithmetic {
    public static void main(String[] args) {
        double number1 = 12;
        double number2 = 6.5;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number1 / number2);

        int number3 = 10;
        int number4 = 4;

        double number3Larger = number3;
        System.out.println(number3Larger);

        System.out.println(number3 % number4);
        System.out.println(number3 / number4); // The division will be an integer only.
    }
}
