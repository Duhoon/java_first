public class jutty{
    public static void main(String args[]){
        int row, col, sum;
        for(row=0; row <5; row++){
            sum = row+1;
            for(col=0; col <5; col++){
                sum = sum+ col * 5;
                System.out.printf(sum+" ");
            }
            System.out.printf("\n");
        }
    }
}