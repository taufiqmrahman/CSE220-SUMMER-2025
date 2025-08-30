import java.util.Scanner;
public class task4{
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the amount of numbers:");
        int num1 = s1.nextInt();
        int nums [] = new int[num1];

        for (int i = 0; i < num1; i++) {
            System.out.println("Enter number " + (i + 1));
            nums[i] = s1.nextInt();
        }

        System.out.println("Enter amount of largest number:");
        int k = s1.nextInt();

        int ans [] = k_largest(nums,k);

        for(int i=0; i<k;i++){
            if(i==0){
                System.out.print("["+ ans[i] +", ");
            }
            else if(i==k-1){
                System.out.print(ans[i] +"]");
            }
            else{
                System.out.print(ans[i] +", ");
            }
        }
        s1.close();

    }
    public static int [] k_largest(int [] nums, int k){
        MaxHeap heap = new MaxHeap(nums.length+1);
        int ans[] = new int[k];

        for(int i=0;i<nums.length;i++){
            heap.insert(nums[i]);
        }
        for(int i=0;i<k;i++){
            ans[i] = heap.extractMax();
        }
        return ans;
    }
}