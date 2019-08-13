public class Overloading {
    public static void main(String args[]){
        int num1, num2;
        num1 = 2;
        num2 = 2;
        Display(num1, num2);
    }

    public static int Calculate(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }

    public static int Calculate(int num1, int num2){
        int result;
        result = num1 - num2;
        return result;
    }

    public static int Calculate(int num1, int num2){
        int result;
        result = num1 * num2;
        return result;
    }

    public static int Calculate(int num1, int num2){
        int result;
        result = num1 / num2;
        return result;
    }

    public static void Display(int num1, int num2){
        System.out.println("Enter : " + num1 + " " + num2);
        System.out.println("Addition : " + Addition(num1, num2));
        System.out.println("Subtraction : " + Subtraction(num1, num2));
        System.out.println("Multiplication : " + Multiplication(num1, num2));
        System.out.println("Division : " + Division(num1, num2));
    }
}