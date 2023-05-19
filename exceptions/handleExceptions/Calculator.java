package exceptions.handleExceptions;

public class Calculator {
    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number needs be greater than or equal to 0");
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize > setSize ||  subsetSize < 0) {
            throw new IllegalArgumentException("Subset size must be bigger than set.");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}