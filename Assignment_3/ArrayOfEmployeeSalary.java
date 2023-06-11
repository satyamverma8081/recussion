// Given is an Array of Employee Salary, add the tax 10% in each salary and return the new array which contains (salary + tax).

import java.util.Arrays;

public class ArrayOfEmployeeSalary {
    public static void main(String[] args) {
        double [] salary = {10000,20000,25000,40000,15000,65000};
        System.out.println(Arrays.toString(finalSalary(salary, 0)));
    }

    static double[] finalSalary(double [] salary,int index){
        if(index == salary.length){
            double[] res = new double[index];
            return res;
        }
        double [] finalResult = finalSalary(salary, index+1);
            finalResult[index] = salary[index] + (salary[index]* 0.1);
        return finalResult;
    }
}
