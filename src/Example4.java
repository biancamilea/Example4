import java.util.Scanner;
class Example4 {
    public static void main(String[] argv) {

        float x;
        float y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextFloat();
        y = scanner.nextFloat();

        float suma = x + y;
        float resta = x - y;
        float multiplicacion = x * y;
        float division = x / y;
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
    }
}
