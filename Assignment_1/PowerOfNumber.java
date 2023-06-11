// 1. Power of a Number
// 2^5

public class PowerOfNumber {
    public static void main(String[] args) {
        powerOf(2,5,1);
        System.out.println(powerOf2(3,3));
    }

    //without return type function
    //Stack Building approach
    static void powerOf(int n, int pow, int res){
        if(pow == 0){
            System.out.println(res);
            return;
        }
        res = res * n;
        powerOf(n,pow-1,res);
    }

    //using return type function
    //Stack Falling approach
    static int powerOf2(int n,int pow){
        if(pow == 0){
            return 1;
        }
        int res = powerOf2(n,pow-1);
        res *= n;
        return res;
    }
}
