import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();


        int max = num1;


        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        if (num1 == num2 && num2 == num3) {
            System.out.println("Все три числа равны.");
        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("Два или более числа равны.");
        }



        System.out.println("Наибольшее число: " + max);

        System.out.println("This is the main branch!");
        System.out.println("Some temporary changes!");
        System.out.println("Fixing a bug!");
        scanner.close();
    }
}

