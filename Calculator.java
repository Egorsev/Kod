import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1=getInt();
        int num2=getInt();
        char operation=gerOperation();
        int result=calc(num1,num2,operation);
        System.out.println("Output:"+result);

    }
    public static char gerOperation(){
        System.out.println("Choose an operation");
        char operation;
        Scanner sc=new Scanner(System.in);
        if (sc.hasNext()) {
            operation = sc.next().charAt(0);
        } else {
            sc.next();
            operation=gerOperation();
        }
        return operation;
    }

    public static int getInt() {
        System.out.println("Input: ");
        int num;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            num = sc.nextInt();
        } else {
            System.out.println("Ошибка");
            sc.nextInt();
            num = getInt();
        }
        return num;
    }
    public static int calc(int num1,int num2,char operation){
        int result;
        switch (operation){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result =num1*num2;
                break;
            case '/':
                result =num1/num2;
                break;
            default:
                System.out.println("Попробуйте еще раз");
                result=calc(num1,num2,operation);
        }
        return result;
    }
}
