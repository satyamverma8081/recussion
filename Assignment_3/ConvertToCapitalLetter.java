// Write recursive function that takes an array of words and returns an array containing all words capitalized
// i/p : ["foo", "bar", "world"]
// o/p : ["FOO", "BAR", "WORLD"]

import java.util.Arrays;

public class ConvertToCapitalLetter{
    public static void main(String[] args) {
        String [] ar = {"foo", "bar", "world","hehe"};
        System.out.println(Arrays.toString( convertToCapital(ar,0)));
    }
    
    static String[] convertToCapital(String [] ar, int index){
        if(index == ar.length){
            String [] res = new String[index];
            return res;
        }
        String [] finalRes = convertToCapital(ar,index+1);
            finalRes[index] = ar[index].toUpperCase();
        return finalRes;
    }
}

