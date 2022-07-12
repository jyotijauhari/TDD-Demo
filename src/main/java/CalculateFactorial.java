public class CalculateFactorial {
    private int number;

    public CalculateFactorial(int number) {
        this.number = number;
    }

    public Integer calculate(int number) {
        //if less than or equal to 1 return 1
        if (number <= 1) {
            return 1;
        }

        //else calculate factorial
        Integer factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

}

