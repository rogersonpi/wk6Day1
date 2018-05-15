public class Calculator {
    private int num1;
    private int num2;

    public Calculator (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;


    }
    public int divide (){

        int result = num1/num2;
        return result;
    }
    public int add (){
        int result = num1 + num2;
        return result;
    }

    public int subtract (){
        int result = num1 - num2;
        return result;
    }

    public int multiply (){
        int result = num1*num2;
        return result;
    }
}
