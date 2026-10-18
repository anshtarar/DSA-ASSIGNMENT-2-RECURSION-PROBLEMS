import java.util.Scanner;

public class linear_search_recursion {
    public static int linearSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        
        if (arr[index] == target) {
            return index;
        }
        
        return linearSearch(arr, target, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int resultIndex = linearSearch(arr, x, 0);
        System.out.println(resultIndex);
        
        sc.close();
    }
}
