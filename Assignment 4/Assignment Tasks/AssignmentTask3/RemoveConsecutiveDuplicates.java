public class RemoveConsecutiveDuplicates{
	
    // You have to write this method
    // YOU MUST SUBMIT THIS METHOD
    public static String removeConsecDups(String word){
        LinkedListQueue ans = new LinkedListQueue();
        for(int i=0; i<word.length();i++){
            char ch = word.charAt(i);
            if(ans.isEmpty()==true){
                ans.enqueue(ch);
            }
            else{
                char ch2 = word.charAt(i-1);
                if(ch!=ch2 && ans.isEmpty()==false){
                    ans.enqueue(ch);
                }
            }
        }
        String ans2 ="";
        while(ans.isEmpty()==false){
            ans2 += ans.dequeue();
        }
        return ans2;
    }
    
    //DO NOT CHANGE and DO NOT SUBMIT THIS METHOD
    public static void assertTest(Object actual, Object expected) {
	if( actual==null || !actual.equals(expected)){
            System.out.println("Test Failed! Expected: " + expected + ", but got: " + actual);
	} else {
            System.out.println("Test Success!!! Expected: " + expected + ", but got: " + actual);
        }
    }

    //DO NOT SUBMIT THE TESTER METHOD
    //DO NOT MODIFY THE MAIN METHOD
    public static void main(String[] args) {
        System.out.println("Test 01");
        String string1 = "aabbbccccdd";
        String returned1 = removeConsecDups(string1);
        assertTest(returned1, "abcd");
        System.out.println("-----------------------------------------");

        System.out.println("Test 02");
        String string2 = "aaabbaa";
        String returned2 = removeConsecDups(string2);
        assertTest(returned2, "aba");
        System.out.println("-----------------------------------------");

        System.out.println("Test 03");
        String string3 = "abcabcabc";
        String returned3 = removeConsecDups(string3);
        assertTest(returned3, "abcabcabc");
        System.out.println("-----------------------------------------");

        System.out.println("Test 04");
        String string4 = "aaaaa";
        String returned4 = removeConsecDups(string4);
        assertTest(returned4, "a");
        System.out.println("-----------------------------------------");
    }
}
