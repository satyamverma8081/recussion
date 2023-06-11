// 3. Sum of N Natural Numbers

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        sumOf_N_Numbers(6,0);
        System.out.println(sumOf_N_Numbers2(6));
        
    }

    //without return type function
    //Stack Building approach
    static void sumOf_N_Numbers(int n,int sum){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        sumOf_N_Numbers(n-1, sum);
    }

    //using return type function
    //Stack Falling approach
    static int sumOf_N_Numbers2(int n){
        if(n == 0){
            return 0;
        }
        int sum = sumOf_N_Numbers2(n-1);
        sum = sum + n;
        return sum;
    }
}
