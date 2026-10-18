public class odd_numbers {
    public static void printOdd1ToN(int n) {
       
        if (n == 0) {
            return;
        }
        
        printOdd1ToN(n - 1);
        
        if (n % 2 != 0) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        printOdd1ToN(n);
    }
}
