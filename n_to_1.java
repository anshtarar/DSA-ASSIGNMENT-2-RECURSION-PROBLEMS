public class n_to_1 { 
    public static void printNTo1 (int n) {
        if (n == 0) {
            return;
        }
        
        System.out.print(n + " ");
        
        printNTo1 (n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNTo1 (n);
    }
}


