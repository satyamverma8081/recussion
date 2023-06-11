// 1. Write a recursive function that takes a list of numbers as an input and return product of all numbers in list

import java.util.ArrayList;

class ProductOfNumberInList{
    public static void main(String[] args) {
        int[] ar = {2,4,6,5,7,8};
        System.out.println(productOfNumbers(ar, ar.length-1));
    }

    static ArrayList<Integer> productOfNumbers(int [] ar, int index){
        if(index == -1){
            ArrayList<Integer> res = new ArrayList<>();
            return res;
        }
        ArrayList<Integer> finalRes = productOfNumbers(ar, index-1);
        finalRes.add(ar[index]*ar[index]);
        return finalRes;
    }
}