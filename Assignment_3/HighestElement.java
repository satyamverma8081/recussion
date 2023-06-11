// Find the Highest Element in an Array 

public class HighestElement {
    public static void main(String[] args) {
        int [] ar = {10,45,33,556,87};
        System.out.println(findHighestighestElement(ar,0));
    }
    static int findHighestighestElement(int[] ar, int index){
        if(index == ar.length){
            int maxElement = Integer.MIN_VALUE;
            return maxElement;
        }
        int maxElement = findHighestighestElement(ar, index+1);
        if(maxElement<ar[index]){
            maxElement = ar[index];
        }
        return maxElement;
    } 
}
