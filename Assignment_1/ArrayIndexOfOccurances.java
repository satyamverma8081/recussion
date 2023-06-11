// 10. Get all found element index (Search Element) , store the result in an array.

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIndexOfOccurances {

    // static void printArray(int [] array){
        
    // }
    public static void main(String[] args) {
        int [] ar = {10,90,100,20,40,88,88,10,23,444,10};
        ArrayList<Integer> ar2= new ArrayList<>();
        indexOfOccurances(ar,0,10,ar2);
        System.out.println(Arrays.toString(indexOfOccurances2(ar,0,10,0)));
    }


    //without return type function
    //Stack Building approach
    static void indexOfOccurances(int [] ar, int index, int element,ArrayList<Integer> res){
        if(index == ar.length){
            System.out.println(res);
            return;
        }
        if(ar[index] == element){
            res.add(index);
        }
        indexOfOccurances(ar, index+1, element, res);
    }

    //using return type function
    //Stack Falling approach
    static int[] indexOfOccurances2(int [] ar, int index,int element,int count){
        if(index == ar.length){
            int[] arr = new int[count];
            return arr;
        }
        if(ar[index] == element){
            count++;
        }
        int [] res = indexOfOccurances2(ar, index+1, element,count);
        if(ar[index] == element){
            res[count-1] = index;
        }
        return res;
    }
}
