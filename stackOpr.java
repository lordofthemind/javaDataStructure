import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
public class stackOpr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s1 = new Stack<>();
        System.out.println("Welcome to stack operation Programm JAVA.");
        System.out.println("Choose Your Option.");
        System.out.println("1: Push Operation.");
        System.out.println("2: Pop Operation.");
        System.out.println("3: Peek Operation.");
        System.out.println("4: Sort Operation.");
        System.out.println("5: Search Operation.");
        System.out.println("6: IsEmpty?");
        System.out.println("7: Size?");
        System.out.println("8: Iterate array");
        System.out.println("9: Exit!!");
        int op = sc.nextInt();
        while (op != 9) {
            switch (op) {
                case 1:
                    System.out.println("You Choose to Push.");
                    System.out.println("Enter Element: ");
                    int el = sc.nextInt();
                    s1.push(el);
                    System.out.println(" Element Pushed: "+el);
                    break;
                    
                case 2:
                    System.out.println("You Choose to Pop.");
                    if(s1.empty()){
                        System.out.println("Stack is Empty!!");
                    }
                    else{
                        el = s1.pop();
                        System.out.println(" Element poped: "+el);
                    }
                    break;

                case 3:
                    System.out.println("You Choose to Peek.");
                    if(s1.empty()){
                        System.out.println("Stack is Empty!!");
                    }
                    else{
                        el = s1.peek();
                        System.out.println(" Element Peeked: "+el); 
                    }               
                    break;
            
                case 4:
                    System.out.println("You Choose to Sort.");
                    if(s1.empty()){
                        System.out.println("Stack is Empty!!");
                    }
                    else{
                        System.out.println("Elements before Sorting");
                        System.out.println(s1);
                        s1.sort(null);
                        System.out.println("Elements after Sorting");
                        System.out.println(s1);
                    }                
                    break;
            
                case 5:
                    System.out.println("You Choose to Search.");
                    if(s1.empty()){
                        System.out.println("Stack is Empty!!");
                    }
                    else{
                        System.out.println("Enter Element you want to Search");
                        el = sc.nextInt();
                        int indF = s1.search(el);
                            if(indF == -1){
                                System.out.println(el+" Element not found in stack!!");
                            }
                            else{
                                System.out.println(el+" Element found at "+indF+" Index.");  
                            }
                    }              
                    break;
            
                case 6:
                    System.out.println("You Choose to cheak if Stack is Empty?");
                    if(s1.empty()){
                        System.out.println("Stack is Empty!!");
                    }
                    else{
                        System.out.println(" Stack is not Empty");
                    }
                    System.out.println("Stack is: "+s1.empty()+"ly Empty.");                
                    break;
            
                case 7:
                    System.out.println("You Choose to cheak Size of Stack!!");
                    System.out.println("Size of the Stack is: "+s1.size());                
                    break;
            
                case 8:
                    System.out.println("You Choose to Iterate.");
                    Iterator<Integer> it = s1.iterator();
                    while (it.hasNext()) {
                        Object s2 = it.next();
                        System.out.print(s2+", ");
                    }
                    System.out.println("");
                    break;
            
                default:
                    System.out.println("Choose valid Option!!");
                    break;
            }
            System.out.println("######################################");
            System.out.println("Choose Your Option.");
            System.out.println("1: Push Operation.");
            System.out.println("2: Pop Operation.");
            System.out.println("3: Peek Operation.");
            System.out.println("4: Sort Operation.");
            System.out.println("5: Search Operation.");
            System.out.println("6: IsEmpty?");
            System.out.println("7: Size?");
            System.out.println("8: Iterate array");
            System.out.println("9: Exit!!");
            op = sc.nextInt();
        }
        sc.close();
    }
}