public class callbyvalue {
    static int globalValue = 20;
    public static void main(String args[]){
        int localValue = 50 ;
        System.out.printf("before change " + localValue + " ");
        localValue = change(500);
        System.out.printf("after change" + localValue + " ");
        System.out.printf("global " + globalValue);
    }
    public static int change(int data){
        int returnValue;
        returnValue = data + 100;
        return returnValue;
    }
}