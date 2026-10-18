public class palindrome_check {
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        String s1 = "madam";
        if (isPalindrome(s1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        String s2 = "hello";
        if (isPalindrome(s2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
