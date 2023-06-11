// 9.Count all Occurrence of Search Element 

public class ArrayCountOccurences {
    public static void main(String[] args) {
        int [] ar = {10,90,100,20,40,88,88,10,23,444,10};
        countOccurances(ar, 0 , 10, 0);
        System.out.println(countOccurances2(ar, 0 , 88));
    }


    //without return type function
    //Stack Building approach

    static void countOccurances(int[] ar, int index, int element, int count){
        if(index == ar.length){
            System.out.println(count);
            return;
        }
        if(ar[index] == element){
            count++;
        }
        countOccurances(ar, index+1, element, count);
    }

    //using return type function
    //Stack Falling approach
    static int countOccurances2(int[] ar, int index, int element){
        if(index == ar.length){
            return 0;
        }
        int count = countOccurances2(ar, index+1, element);
        if(ar[index] == element){
            count += 1;
        }
        return count;
    }
}
