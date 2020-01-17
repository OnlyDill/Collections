
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorSample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        ListIterator li = list.listIterator();
        li.add("a");
        li.add("b");
        li.add("c");
        li.previous();
        li.previous();
        li.previous();
        showList(list, li);
        System.out.println("Move 1 - travel next over " + li.next());
        showList(list, li);

        System.out.println("Move 2 - travel next over " + li.next());
        showList(list, li);

        System.out.println("Move 3 - taking out last item travelled over");
        li.remove();
        showList(list, li);

        System.out.println("Move 4 - adding b to the left of the iterator");
        li.add("b");
        showList(list, li);

        System.out.println("Move 5 - travel next over " + li.next());
        showList(list, li);

        System.out.println("Move 6 - travel back over " + li.previous());
        showList(list, li);

        System.out.println("Move 7 - taking out last item travelled over");
        li.remove();
        showList(list, li);

        System.out.println("Move 8 - travel back over " + li.previous());
        showList(list, li);

        System.out.println("Move 9 - change last thing travelled over to e");
        li.set("e");
        showList(list, li);

        System.out.println("Move 10 & 11 - adding b and c to left of iterator");
        li.add("b");
        li.add("c");
        showList(list, li);

        System.out.println("Move 12 - trying to remove without next or previous");
        try {
            li.remove();
        } catch (Exception e) {
            System.out.println(e);
        }
        showList(list, li);

        System.out.println("Move 13 - travel next over " + li.next());
        showList(list, li);
        
        try{
        System.out.println("Move 14 - travel next over " + li.next());
        }catch(Exception e){
            System.out.println(e);
        }
        showList(list, li);
        
        System.out.println("Move 15 - going back to start of list");
        while(li.hasPrevious()){
            li.previous();
        }
        

    }

    public static void showList(ArrayList al, ListIterator li) {
        if (li.hasPrevious() == false) {
            System.out.print("* |");
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " | ");
            if (i == li.previousIndex()) {
                System.out.print("* |");
            }
        }
        System.out.println("\n-----------------");
    }

}
