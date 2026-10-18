public class gcd_calculation {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int result = findGCD(a, b);
        System.out.println(result); 
    }
}
