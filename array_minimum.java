import java.util.Scanner;

public class array_minimum {
    public static int findMin(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        
        int minOfRest = findMin(arr, index + 1);
        
        return Math.min(arr[index], minOfRest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int minElement = findMin(arr, 0);
        System.out.println(minElement);
        
        sc.close();
    }
}
