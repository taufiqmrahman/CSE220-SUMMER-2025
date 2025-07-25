//Assignment Task 01: Container with Most Water
class AssgnTask1{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void mostWater( Integer[] height ){

        int len = height.length;
        int max =0;
        for(int i=1; i<len+1;i++){
            int area =0;
            for (int j=0; j< len;j++ ){
                area = height[j] *(j-i);
                if(area>max){
                    max = area;
                }
            }
        }
        System.out.println(max);

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
