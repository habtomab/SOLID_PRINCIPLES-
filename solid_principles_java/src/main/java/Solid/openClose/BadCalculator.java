package Solid.openClose;

public class BadCalculator {
    public int calculateNumber(int num1,int num2,String type){
        int result=0;
        switch (type){
            case"sub":
                    result= num1-num2;
            case"sum":
                    result= num1+num2;
        }
        return result;
    }
}
