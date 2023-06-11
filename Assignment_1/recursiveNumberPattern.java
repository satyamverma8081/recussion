// 4. 1/1^1 + 2 / 2 ^2 + 3 / 3^3 

public class recursiveNumberPattern {
    public static void main(String[] args) {
        sumPattern(3,0);
        System.out.println(sumPattern2(2));
    }

    //without return type function
    //Stack Building approach
    static void sumPattern(int n, double res){
        if(n == 0){
            System.out.println(res);
            return;
        }
        res = res + (n/(Math.pow(n, n)));
        sumPattern(n-1, res);
    }

    //using return type function
    //Stack Falling approach
    static double sumPattern2(int n){
        if(n == 0){
            return 0;
        }
        double res = sumPattern2(n-1);
        res = res + (n/(Math.pow(n, n)));
        return res;
    }
}
