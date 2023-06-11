// 7. Check Palindrome String

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcccba";
        isPalindrome(str,0, str.length()-1);
        System.out.println((isPalindrome2(str, 0, str.length()-1)?"Is a Palindrome":"Not a Palindrome"));
    }

    //without return type function
    //Stack Building approach
    static void isPalindrome(String str, int firstIndex, int lastIndex){
        if(firstIndex >= lastIndex){
            System.out.println("String is a Palindrome");
            return;
        }
        if(str.charAt(firstIndex) != str.charAt(lastIndex)){
            System.out.println("String is not a Palindrome");
            return;
        }
        isPalindrome(str, firstIndex+1, lastIndex-1);
        
    }

    //using return type function
    //Stack Falling approach
    static boolean isPalindrome2(String str, int firstIndex, int lastIndex){
        if(firstIndex >= lastIndex){
            return true;
        }
        boolean is = isPalindrome2(str, firstIndex+1, lastIndex-1);
        if(str.charAt(firstIndex) != str.charAt(lastIndex)){
            return false;
        }
        return is;
    }
}
