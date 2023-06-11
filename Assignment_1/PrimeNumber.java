// 5. Check the Given Number is Prime or Not?

public class PrimeNumber{
    public static void main(String[] args) {
        checkPrimeNumber(5 ,2);
        System.out.println(checkPrimeNumber2(5,2)?"It's a Prime Numeber":"It's not a Prime Number");
    }

    //without return type function
    //Stack Building approach
    static void checkPrimeNumber(int n, int i){
        if(n < 2){
            System.out.println("Not A Prime Number");
            return;
        }
        if(i == n){
            System.out.println("Prime Number");
            return;
        }
        if(n%i == 0){
            System.out.println("Not A Prime Number");
            return;
        }
        checkPrimeNumber(n, i+1);
    }

    //using return type function
    //Stack Falling approach
    static boolean checkPrimeNumber2(int n,int i){
        if(n < 2){
            return false;
        }
        if(i == n){
            return true;
        }
        boolean res = checkPrimeNumber2(n, i+1);
        if(n%i == 0){
            res = false;
        }
        return res;
    }
}
