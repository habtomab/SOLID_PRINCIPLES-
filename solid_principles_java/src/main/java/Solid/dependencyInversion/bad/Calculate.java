package Solid.dependencyInversion.bad;

import Solid.openClose.Operation;

public class Calculate {
    public int calculateNumber(int num1, int num2, String operation){
        int result=0;
        switch (operation){
            case"sub":
                AddOperation addOperation= new AddOperation();
                result= addOperation.perform(num1,num2);
            case"sum":
                SubtractOperation subtractOperation= new SubtractOperation();
                result= subtractOperation.perform(num1,num2);
        }
        return result;
    }
}
