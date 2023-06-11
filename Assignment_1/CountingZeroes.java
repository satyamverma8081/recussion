// 2. Count Zero in a Given Number

// Num = 102030

// Count 0 - 3

public class CountingZeroes{
    public static void main(String[] args) {
        countAllZero(1002203010,0);
        System.out.println(countAllZero2(1320310));
    }

    //without return type function
    //Stack Building approach
    static void countAllZero(int num, int res){
        if(num == 0){
            System.out.println(res);
            return;
        }
        if(num%10 == 0){
            res++;
        }
        countAllZero(num/10, res);
    }

    //using return type function
    //Stack Falling approach
    static int countAllZero2(int num){
        if(num == 0 ){
            return 0;
        }
        int res = countAllZero2(num/10);
        if(num%10 == 0){
            res++;
        }
        return res;
    }
}