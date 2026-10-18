public class count_digits {
    public static int countDigitsRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        
        return 1 + countDigitsRecursive(n / 10);
    }

    public static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }
        return countDigitsRecursive(n);
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(countDigits(n)); 

        int edgeCase = 0;
        System.out.println(countDigits(edgeCase)); 
    }
}
