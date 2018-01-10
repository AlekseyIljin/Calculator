import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Давай числа посчитаю: алгоритм такой:\n " +
                "сначала два числа пишем, потом действие. \n" +
                "Кривенько, знаю. Поехали:");
        System.out.println(calc(getInt(),getInt(),getOperation()));

    }
    public static int getInt(){
        System.out.println("Число:");
        Scanner in = new Scanner(System.in);
        int sym = in.nextInt();
        return sym;
    }
    public static String getOperation(){
        System.out.println("Введите необходимое действие: *, /, +, -");
        Scanner in = new Scanner(System.in);
        String oper = in.next();
        return oper;
    }
    public static int calc (int num1, int num2, String operation){
        int result = 0;
        switch(operation){
            case ("+"):{
              result = num1+num2;
                break;
            }
            case ("-"):{
                result = num1-num2;
                break;
            }
            case ("*"):{
                result = num1*num2;
                break;
            }
            case ("/"):{
                result = num1/num2;
                break;
            }
        }

        return result;
    }
}
