import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;
public class lLinkOpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> lst = new LinkedList<>();
        System.out.println("Linked List programm with Java.");
        System.out.println("Choose your option: ");
        System.out.println("1: Add element.");
        System.out.println("2: Add element at start.");
        System.out.println("3: Add element at index.");
        System.out.println("4: Add element at end.");
        System.out.println("5: Remove element.");
        System.out.println("6: Remove element at start.");
        System.out.println("7: Remove element at index.");
        System.out.println("8: Remove element at end.");
        System.out.println("9: Search element.");
        System.out.println("10: Size?");
        System.out.println("11: Iterate List.");
        System.out.println("12: Exit!!");
        int op = sc.nextInt();
        while (op != 12) {
            switch (op) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int el = sc.nextInt();
                    lst.add(el);
                    break;
            
                case 2:
                    System.out.print("Enter element to add at start: ");
                    el = sc.nextInt();
                    lst.addFirst(el);
                    break;
                    
                case 3:
                    System.out.print("Enter element to add: ");
                    el = sc.nextInt();
                    System.out.print("Enter index of element: ");
                    int in = sc.nextInt();
                    lst.add(in, el);
                    break;
                    
                case 4:
                    System.out.print("Enter element to add at end: ");
                    el = sc.nextInt();
                    lst.addLast(el);                    
                    break;
            
                case 5:
                    System.out.print("You choose to remove.");
                    lst.remove();
                    break;
            
                case 6:
                    System.out.print("You choose to remove from start.");
                    lst.removeFirst();
                    break;
            
                case 7:
                    System.out.print("Enter index of element to remove: ");
                    in = sc.nextInt();
                    lst.remove(in);
                    
                    break;
            
                case 8:
                    System.out.print("You choose to remove from start.");
                    lst.removeLast();
                    break;
            
                case 9:
                    System.out.print("Enter element you want to search: ");
                    el = sc.nextInt();
                    boolean res = lst.contains(el);
                    if (res) {
                        System.out.println("Element is present in list.");
                    } else {
                        System.out.println("Element is not present in list.");
                    }
                    break;
            
                case 10:
                    int sz = lst.size();
                    System.out.println("Size of list is: "+sz);
                    break;
            
                case 11:
                    Iterator<Integer> it = lst.iterator();
                    while(it.hasNext()){
                        System.out.print(it.next()+" ");
                    }
                    System.out.println("");
                    break;
            
                default:
                    System.out.println("Choose valid option.");
                    break;
            }            
            System.out.println("#####################################");
            System.out.println("Choose your option: ");
            System.out.println("1: Add element.");
            System.out.println("2: Add element at start.");
            System.out.println("3: Add element at index.");
            System.out.println("4: Add element at end.");
            System.out.println("5: Remove element.");
            System.out.println("6: Remove element at start.");
            System.out.println("7: Remove element at index.");
            System.out.println("8: Remove element at end.");
            System.out.println("9: Search element.");
            System.out.println("10: Size?");
            System.out.println("11: Iterate List.");
            System.out.println("12: Exit!!");
            op = sc.nextInt();
        }
        sc.close();
    }
}
