import java.util.LinkedList;
import java.util.Iterator;

public class lListImp {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(8);
        l1.add(4);
        l1.add(9);
        l1.add(10);
        l1.add(1, 2);
        l1.remove(3);
        l1.removeFirst();
        l1.removeLast();

        Iterator<Integer> it = l1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("");
    }
}