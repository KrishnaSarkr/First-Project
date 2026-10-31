public class LoopConditionExample {
    public static void main(String[] args) {
        
        // ১ থেকে ১০ পর্যন্ত চলার জন্য for লুপ
        for (int i = 1; i <= 10; i++) {
            
            // সংখ্যাটি ২ দিয়ে ভাগ করলে ভাগশেষ ০ হলে সেটি জোড়
            if (i % 2 == 0) {
                System.out.println(i + " হলো জোড় সংখ্যা (Even)");
            } else {
                System.out.println(i + " হলো বিজোড় সংখ্যা (Odd)");
            }
            
        }
        
    }
}