public class decimal_to_binary {
    public static void convertToBinary(int n) {
        if (n == 0) {
            return;
        }
        
        convertToBinary(n / 2);
        
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        int n = 10;
        
        if (n == 0) {
            System.out.println(0);
        } else {
            convertToBinary(n);
            System.out.println(); 
        }
    }
}
