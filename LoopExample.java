import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("একটি সংখ্যা লিখুন: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " হলো জোড় সংখ্যা (Even Number)।");
        } else {
            System.out.println(number + " হলো বিজোড় সংখ্যা (Odd Number)।");
        }

        input.close();
    }
}