public class DisplayOverloading {
    public void display(String c){
        System.out.printf("One parameter:"+c);
    }
    public void display(String c, int num){
        System.out.printf("Two parameters Method:"+c+","+num);
    }
    public void display(int c){ System.out.printf("One parameter:"+c);}

}