// 12.Given a String find the adjacent element if it is same as the previous element so replace the element with #.

// e.g "aabbcc" 

// output a#b#c#

public class ArrayReplaceAdjacent {
    public static void main(String[] args) {
        // String str = "aabbccdddeeee";
        String str = "aabbcc";

        replaceAdjacent(str,0);

        System.out.println(replaceAdjacent2(str,0));
    }


    //without return type function
    //Stack Building approach
    static void replaceAdjacent(String str,int character){
        if(character == str.length()-1){
            System.out.println(str);
            return;
        }
        if(str.charAt(character) == str.charAt(character+1)){
            // str = str.replace(str.charAt(character+1),'#');
            str= str.substring(0, character+1) + '#' + str.substring(character+2);
        }
        replaceAdjacent(str, character+1);
    }

    //using return type function
    //Stack Falling approach
    static StringBuilder replaceAdjacent2(String str,int character){
        if(character == str.length()-1){
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(character));
            return sb;
        }
        StringBuilder sb = replaceAdjacent2(str, character+1);

        if(str.charAt(character) == sb.charAt(0)){
            sb.insert(1,"#");
        }else{
            sb.insert(0,str.charAt(character));
        }
        return sb;
    }
}
