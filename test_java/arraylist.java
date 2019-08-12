public class arraylist {
    public static void main(String args[]){
        java.util.List<String> list = new java.util.ArrayList<String> ();
        list.add("Item1"); list.add("Item2"); list.add("Item3"); list.add("Item4");
        System.out.printf("The arraylist contains elements : " + list + "\n");
        int pos = list.indexOf("Item2");
        System.out.printf("The index of Item2 is : " + pos + "\n");
        System.out.printf("Checking is empty: " + list.isEmpty() + "\n");
        int size = list.size();
        System.out.printf("The size of the list is : " + size + "\n");
        for (int i = 0; i < list.size(); i++){
            System.out.printf("Index : " + i + " - item :" + list.get(i) + "\n");
        }
    }
}