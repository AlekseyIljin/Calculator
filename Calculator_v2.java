import java.util.Scanner;

public class Calculator_v2 {
    public static void main(String[] args) {
        System.out.println("Посчитаем вместе? в любой момент нажмите \"q\"");

        System.out.println(calc(getInt(),getInt(),getOperation()));

    }
    public static double getInt(){
        System.out.println("Число:");
        Scanner in = new Scanner(System.in);
        double sym;
        while(!in.hasNextDouble()) {
            if(in.next().charAt(0)=='q'){
                quit();
            }
            System.out.println("Повторите ввод");
        }

        return sym = in.nextDouble();
    }

    public static void quit(){
        System.out.println("Возвращайтесь еще!");
        System.exit(0);
    }
    public static String getOperation(){
        System.out.println("Введите необходимое действие: *, /, +, -, %");
        Scanner in = new Scanner(System.in);
        String oper = in.next();
        return oper;
    }
    public static double calc (double num1, double num2, String operation){
        double result = 0;
        switch(operation){
            case "+":{
                result = num1+num2;
                calc(getInt(),getInt(),getOperation());
                break;
            }
            case "-":{
                result = num1-num2;
                calc(getInt(),getInt(),getOperation());
                break;
            }
            case "*":{
                result = num1*num2;
                calc(getInt(),getInt(),getOperation());
                break;
            }
            case "/":{
                result = num1/num2;
                calc(getInt(),getInt(),getOperation());
                break;
            }
            case "%":{
                result = num1 + (num1/100*num2);
                calc(getInt(),getInt(),getOperation());
                break;
            }
            case "q":{
                    quit();
                break;}
            default:{
                System.out.println("Неверная операция, попробуйте снова");
                calc(getInt(),getInt(),getOperation());
            }
        }

        return result;
    }
}
