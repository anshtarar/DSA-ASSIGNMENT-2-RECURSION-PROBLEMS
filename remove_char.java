public class remove_char {
    public static String removeCharacter(String str, char c) {
        if (str == null || str.length() == 0) {
            return "";
        }
        
        if (str.charAt(0) == c) {
            return removeCharacter(str.substring(1), c);
        } else {
            return str.charAt(0) + removeCharacter(str.substring(1), c);
        }
    }

    public static void main(String[] args) {
        String s = "banana";
        char target = 'a';
        
        String result = removeCharacter(s, target);
        System.out.println(result); 
    }
}

