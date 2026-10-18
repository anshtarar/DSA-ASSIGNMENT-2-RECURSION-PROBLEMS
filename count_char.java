public class count_char {
    public static int countOccurrences(String str, char c) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        
        int matchValue = (str.charAt(0) == c) ? 1 : 0;
        
        return matchValue + countOccurrences(str.substring(1), c);
    }

    public static void main(String[] args) {
        String s = "programming";
        char target = 'g';
        
        int result = countOccurrences(s, target);
        System.out.println(result); 
    }
}
