public class even_numbers{
    public static void printEven1ToN(int n) {
        if (n == 0) {
            return;
        }
        
        printEven1ToN(n - 1);
        
        if (n % 2 == 0) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        printEven1ToN(n);
    }
}
