// 8.Array Search the Element From the Last. (lastIndexOf)

public class ArraySearchLast {
    public static void main(String[] args) {
        int [] ar = {10,90,100,20,40,88};
        lastIndexOf(ar , ar.length-1 , 100);
        System.out.println("Element found at Index: "+lastIndexOf2(ar, ar.length-1 ,20));
    }

    //without return type function
    //Stack Building approach
    static void lastIndexOf(int[] ar, int index, int element){
        if(index < 0){
            System.out.println("Element Not present in the Array");
            return;
        }
        if(ar[index] == element){
            System.out.println("Element "+element+" found at Index: "+index);
            return;
        }
        lastIndexOf(ar, index-1, element);
    }

    //using return type function
    //Stack Falling approach
    static int lastIndexOf2(int[] ar, int index,int element){
        if(index < 0){
            return -1;
        }
        if(ar[index] == element){
            return index;
        }
        int res = lastIndexOf2(ar,index-1, element);
        return res;
    }
}
