package Solid.dependencyInversion.good;


public class Calculate {
    public int calculateNumber(int num1, int num2, CalculatorOperation operation){
        return operation.calculate(num1,num2);
    }
}
