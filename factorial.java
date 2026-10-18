public class factorial {
    public static int getFactorial(int n) {
        // Base Case: 0! is 1 and 1! is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * getFactorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = getFactorial(n);
        System.out.println(result); 
    }
}
