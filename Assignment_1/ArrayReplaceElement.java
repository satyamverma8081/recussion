// 11. Given an Array find the element and replace the value with given value, search and replace all occurrences.

import java.util.Arrays;

public class ArrayReplaceElement {
    public static void main(String[] args) {
        int [] ar = {10,90,100,20,40,88,88,10,23,444,10};
        replaceElement(ar, 0, 10, 7);

        int [] arr2 = {10,90,100,88,40,88,88,10,23,444,10};
        System.out.println(Arrays.toString(replaceElement2(arr2, 0, 88, 8)));
    }


    //without return type function
    //Stack Building approach
    static void replaceElement(int[] ar, int index, int element, int newElement){
        if(index == ar.length){
            System.out.println(Arrays.toString(ar));
            return;
        }
        if(ar[index] == element){
            ar[index] = newElement;
        }
        replaceElement(ar, index+1, element, newElement);
    }

    //using return type function
    //Stack Falling approach
    static int[] replaceElement2(int[] ar, int index, int element, int newElement){
        if(index == ar.length-1){
            if(ar[index] == element){
                ar[index] = newElement;
            }
            return ar;
        }
        ar = replaceElement2(ar, index+1, element, newElement);
        if(ar[index] == element){
            ar[index] = newElement;
        }
        return ar;
    }
}
