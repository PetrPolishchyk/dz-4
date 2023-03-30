import java.util.Scanner;

public class Execution {

    public int getValue(){
        Scanner number = new Scanner(System.in);
        int integerNumber = number.nextInt();
        return integerNumber;
    }

    public int getSum(int a, int b){
        int result = a + b;
        return result;
    }

    public String getResult(int number){
        System.out.println("The sum is: ");
        String sum = String.format("---<%d>---", number);
        return sum;
    }

}
