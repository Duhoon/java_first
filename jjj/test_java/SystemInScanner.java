public class SystemInScanner{
    public static void main(String args[]) throws java.io.IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nEnter the first character:");
        int ch1 = scanner.nexlnt();
        System.out.printf("After conversion:" +ch1);
    }
}