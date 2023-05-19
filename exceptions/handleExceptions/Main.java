package exceptions.handleExceptions;

public class Main {
    public static void main(String[] args){
        Person palmer = new Person("Palmer", 25);
        System.out.println(palmer);

        Calculator calculator = new Calculator();
        System.out.println(calculator.factorial(14));
        System.out.println(calculator.binomialCoefficient(15,6));
    }
}