
import java.util.ArrayList;


public class ArrayListReview {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add(1, "c");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("\n");
        System.out.println("b is at location " + list.indexOf("b"));
        System.out.println("Getting of rid of c");
        list.remove(2);
        System.out.println("Change b to e");
        list.set(1, "e");
        System.out.println("Adding the letter f to the end");
        list.add("f");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(String string : list) {
            System.out.println(string);
        }
    }
    
}
