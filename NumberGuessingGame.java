import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // প্রথম সংখ্যা ইনপুট নেওয়া
        System.out.print("প্রথম সংখ্যাটি লিখুন: ");
        double num1 = scanner.nextDouble();
        
        // দ্বিতীয় সংখ্যা ইনপুট নেওয়া
        System.out.print("দ্বিতীয় সংখ্যাটি লিখুন: ");
        double num2 = scanner.nextDouble();
        
        // যোগফল নির্ণয়
        double sum = num1 + num2;
        
        // ফলাফল দেখানো
        System.out.println("যোগফল (Sum): " + sum);
        
        scanner.close();
    }
}