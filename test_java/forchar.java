public class forchar {
    public static void main(String args[]){
        int row, col, sum;
        for(row = 0 ; row < 5 ; row++){
            for(col = 0; col < 5; col++){
                if ( row==0 || row == 4){
                    System.out.printf("~ ");
                } else if ( col == 0 || col ==4){
                    System.out.printf("! ");
                } else {
                    sum = row + 5 * (col -1);
                    System.out.printf(sum + " ");
                }
            }
            System.out.printf("\n");
        }

    }
}