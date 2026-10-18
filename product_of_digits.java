public class product_of_digits {
    public static int getProductOfDigits(int n) {
        // Base Case: If it's a single digit (0-9), return the number itself
        if (n < 10) {
            return n;
        }
        
        // Recursive Step: Extract last digit * process remaining digits
        return (n % 10) * getProductOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 234;
        int result = getProductOfDigits(n);
        System.out.println(result); // Outputs: 24
    }
}
