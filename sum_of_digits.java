public class sum_of_digits {
    public static int getSumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        
        return (n % 10) + getSumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 1234;
        int result = getSumOfDigits(n);
        System.out.println(result); 
    }
}
