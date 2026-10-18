public class fibonacci_series {
    public static int getFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 7;
        
        for (int i = 0; i < n; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
        System.out.println();
    }
}
