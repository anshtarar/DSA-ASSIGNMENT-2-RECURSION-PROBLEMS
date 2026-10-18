public class replace_char {
    public static String replaceCharacter(String str, char c1, char c2) {
      
        if (str == null || str.length() == 0) {
            return "";
        }
        
        if (str.charAt(0) == c1) {
            return c2 + replaceCharacter(str.substring(1), c1, c2);
        } else {
            return str.charAt(0) + replaceCharacter(str.substring(1), c1, c2);
        }
    }

    public static void main(String[] args) {
        String s = "banana";
        char c1 = 'a';
        char c2 = 'o';
        
        String result = replaceCharacter(s, c1, c2);
        System.out.println(result); 
    }
}
