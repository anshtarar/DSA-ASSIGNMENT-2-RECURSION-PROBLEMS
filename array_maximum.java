import java.util.Scanner;

public class array_maximum {
    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        
        int maxOfRest = findMax(arr, index + 1);
        
        return Math.max(arr[index], maxOfRest);
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
        
        int maxElement = findMax(arr, 0);
        System.out.println(maxElement);
        
        sc.close();
    }
}
