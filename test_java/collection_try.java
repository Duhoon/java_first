import java.util.ArrayList;
import java.util.HashMap;

public class collection_try {
    public static void main(String args[]){
        ArrayList<Integer> list1 =  new ArrayList<Integer>();
        list1.add(39); list1.add(20); list1.add(30); list1.add(12); list1.add(40);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(48); list2.add(20); list2.add(10); list2.add(32);
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(99); list3.add(23); list3.add(123);
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        list4.add(49); list4.add(22); list4.add(45); list4.add(12);

        HashMap<Object,Object> fruit = new HashMap<Object,Object>();
        fruit.put("Mango", list1);
        fruit.put("Apple", list2);
        fruit.put("Banana", list3);
        fruit.put("Melon", list4);
        ArrayList<String> test = fruit.keyset();
        /*
        for ( String key : fruit.keyset()){
            for ( int i = 0 ; fruit int < )
        }
        for ( String key : fruit.keyset()){
            System.out.println(key + "\n");
        }
        */
    }
}