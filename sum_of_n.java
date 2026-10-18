public class sum_of_n {
    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        
        return n + getSum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = getSum(n);
        System.out.println(result); 
    }
}
