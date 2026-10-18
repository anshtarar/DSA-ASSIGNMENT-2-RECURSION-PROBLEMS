public class binary_to_decimal {
    public static int convertToDecimal(String binaryStr, int index, int currentSum) {
        if (index == binaryStr.length()) {
            return currentSum;
        }
        
        int digitValue = binaryStr.charAt(index) - '0';
        
         return convertToDecimal(binaryStr, index + 1, (currentSum * 2) + digitValue);
    }

    public static void main(String[] args) {
        String s = "1011";
        
         int result = convertToDecimal(s, 0, 0);
        System.out.println(result);  
    }
}
