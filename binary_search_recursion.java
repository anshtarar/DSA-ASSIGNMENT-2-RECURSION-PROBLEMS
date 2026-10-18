import java.util.Scanner;

public class binary_search_recursion {
    public static int recursiveBinarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        
        int mid = low + (high - low) / 2;
        
      
        if (arr[mid] == target) {
          
            if (mid == 0 || arr[mid - 1] != target) {
                return mid;
            } else {
             
                return recursiveBinarySearch(arr, target, low, mid - 1);
            }
        }

        if (arr[mid] > target) {
            return recursiveBinarySearch(arr, target, low, mid - 1);
        }
        
   
        return recursiveBinarySearch(arr, target, mid + 1, high);
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
        
        int resultIndex = recursiveBinarySearch(arr, x, 0, n - 1);
        System.out.println(resultIndex);
        
        sc.close();
    }
}
