// 6. Check the Given Number is Armstrong or Not?

// 153

// 1^3 + 5^3 + 3^3 = 153

public class ArmstrongNumber {

    static int countNumber(int num){
        if(num == 0){
            return 0;
        } 
        int count = countNumber(num/10);
        count += 1;
        return count;
    }
    public static void main(String[] args) {
        int num = 153;
        int count = countNumber(num);
        checkArmstrongNumber(num ,0, count,num);
        int res = checkArmstrongNumber2(num,count);
        if(res == num){
            System.out.println("It's an Armstrong Number");
        }else{
            System.out.println("It's not an Armstrong Number");
        }
    }

    //without return type function
    //Stack Building approach
    static void checkArmstrongNumber(int n, int sum, int count,int original){
        if(original == sum){
            System.out.println("Armstrong Number");
            return;
        }
        if(n == 0){
            System.out.println("Not Armstrong Number");
            return;
        }
        int singleNumber = n % 10;
        sum += (int)Math.pow(singleNumber, count);
        checkArmstrongNumber(n/10, sum, count, original);
    }


    //using return type function
    //Stack Falling approach
    static int checkArmstrongNumber2(int n, int count){
        if(n == 0){
            return 0;
        }
        int sum = checkArmstrongNumber2(n/10, count);
        int singleNumber = n % 10;
        sum += (int)Math.pow(singleNumber, count);
        return sum;
    }
}
