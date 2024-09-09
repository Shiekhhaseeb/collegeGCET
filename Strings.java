public class Strings {
    public static void main(String[] args) {
     
        String str = "Hello, Java World!";
        

        int length = str.length();
        System.out.println("Length of the string: " + length);
        

        String substring = str.substring(7, 11); 
        System.out.println("Extracted substring: " + substring);
        

        String newStr = str.concat(" It's a beautiful day.");
        System.out.println("Concatenated string: " + newStr);
        
    
        char charAtSpecificIndex = str.charAt(4); 
        System.out.println("Character at index 4: " + charAtSpecificIndex);
    }
}
