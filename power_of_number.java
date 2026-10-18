public class power_of_number {
    public static long calculatePower(int a, int b) {
        if (b == 0) {
            return 1;
        }
        
        return a * calculatePower(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        long result = calculatePower(a, b);
        System.out.println(result); 
    }
}
