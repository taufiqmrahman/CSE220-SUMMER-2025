//task3
import java.util.Scanner;
public class task3{
    public static void main(String [] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of tasks:");
        int numTasks = s1.nextInt();
        int tasks [] = new int[numTasks];

        for (int i = 0; i < numTasks; i++) {
            System.out.println("Enter task " + (i + 1) + " duration:");
            tasks[i] = s1.nextInt();
        }

        System.out.println("Enter the number of Machines:");
        int m = s1.nextInt();

        int ans [] = scheduleTasks(tasks,m);

        for(int i=0; i<m;i++){
            if(i==0){
                System.out.print("["+ ans[i] +", ");
            }
            else if(i==m-1){
                System.out.print(ans[i] +"]");
            }
            else{
                System.out.print(ans[i] +", ");
            }
        }
        s1.close();

    }
    public static int[] scheduleTasks(int [] tasks, int m){
        
        MinHeap heap = new MinHeap(tasks.length+1); 
        for (int i = 1; i <tasks.length; i++) {
            heap.insert(0);
        }
        
        for (int i = 0; i < tasks.length; i++) {
            int min = heap.extractMin();
            min += tasks[i];
            heap.insert(min);
        }
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            result[i] = heap.extractMin();
        }
        return result;
    }
}
