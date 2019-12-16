package calculator;

public class StaticCalculator {
    public static int add(int a, int b) {
        return a+b;
    }
    public static int sub(int a, int b) {
        return a-b;
    }
    public static int mulipy(int a, int b) {
        return a*b;
    }
    public static int divide(int a, int b) throws ZeroDividedException {
        if(b==0)
            throw new ZeroDividedException("You can not divide by zero");
        return a/b;
    }
    public static int rest(int a, int b) {
        if(b==0) {
            System.out.println("nunu");
            return -1;
        }
        return a%b;
    }
}
