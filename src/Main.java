public class Main {

    public static void main(String[] args) {

        Execution execution = new Execution();
        System.out.println("Please enter the first integer");
        int firstNumber = execution.getValue();
        System.out.println("Please enter the second integer");
        int secondNumber = execution.getValue();

        int theSum = execution.getSum(firstNumber, secondNumber);

        System.out.printf(execution.getResult(theSum));

    }
}
