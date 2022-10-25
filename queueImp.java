import java.util.Scanner;
class queueArray{

    int frontQ, rearQ;
    int qCapacity;
    static int[] q1;

    queueArray(int size){
        qCapacity = size;
        q1 = new int[qCapacity];
    }

    void enQueue(int val){
        if(rearQ == qCapacity){
            System.out.println("Queue is already full, you cannot insert element.");
        }
        else{
            q1[rearQ] = val;
            rearQ++;
        }
    }

    void deQueue(){
        if(rearQ == 0){
            System.out.println("Queue is empty, nothing to delete.");
        }
        else{
            for(int i=0;i<rearQ;i++){
                q1[i+1] = q1[i];
            }
            rearQ--;
        }
    }

    void viewQueue(){
        if(rearQ == 0){
            System.out.println("Queue is empty, nothing to display.");
        }
        else{
            System.out.println("Element of queue is: ");
            for(int i=0;i<rearQ;i++){
                System.out.print(q1[i]+" ");
            }
        }
    }

}
public class queueImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Queue programm using array in Java.");
        System.out.print("Enter the size of queue: ");
        int sz = sc.nextInt();
        queueArray que = new queueArray(sz);
        System.out.println("Choose your option:");
        System.out.println("1: Insert element in Queue.");
        System.out.println("2: Delete element from Queue.");
        System.out.println("3: View elements from Queue.");
        System.out.println("4: Exit!");
        int op = sc.nextInt();
        while (op != 4) {
            switch (op) {
                case 1:
                    System.out.println("You choose to insert element in Queue.");
                    System.out.print("Enter element: ");
                    int el = sc.nextInt();
                    que.enQueue(el);
                    break;
                    
                case 2:
                    System.out.println("You choose to delete element from Queue.");
                    que.deQueue();
                    break;
                    
                case 3:
                    System.out.println("You choose to view elements from Queue.");
                    que.viewQueue();
                    break;
                    
                default:
                    System.out.println("Choose valid option!!");
                    break;
            }
            System.out.println("Choose your option:");
            System.out.println("1: Insert element in Queue.");
            System.out.println("2: Delete element from Queue.");
            System.out.println("3: View elements from Queue.");
            System.out.println("4: Exit!");
            op = sc.nextInt();
        }
        sc.close();
    }
}