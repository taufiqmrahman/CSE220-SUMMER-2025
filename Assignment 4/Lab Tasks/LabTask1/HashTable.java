/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new FruitNode[size];
    }
    
    //This method basically prints the HashTable
    //DO NOT change this method
    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    //you need to COMPLETE this method
    private int hashFunction( String key ){
        int length = key.length();
        int sum =0;
        int size = ht.length;
        if(length%2==0){
            for(int i=0;i<key.length();i+=2){
                int ch = (char)key.charAt(i);
                sum += ch;
            }
        }
        else{
            for(int i=1;i<key.length();i+=2){
                int ch = (char)key.charAt(i);
                sum += ch;
            }
        }
        int idx = sum % size;
        return idx; 
    }

    //you need to COMPLETE this method
    //The insert() method will create a FruitNode using name(Key) & price(value)
	//then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value){
        int idx = hashFunction(key);

        FruitNode newN = new FruitNode(key,value);
        if(ht[idx]==null){
            ht[idx] = newN;
        }
        else{
            // First, check if the key already exists and update if found
            boolean found = false;
            FruitNode temp = ht[idx];
            while(temp != null){
                if(temp.fruit[0].equals(key)){
                    temp.fruit[1] = value;
                    found = true;
                    break;
                }
                temp = temp.next;
            }

            if(found==false){
                if(value > (Integer)ht[idx].fruit[1]){
                    newN.next = ht[idx];
                    ht[idx] = newN;
                }
                else{
                    FruitNode current = ht[idx];
                    FruitNode prev = null;
                    while(current != null && (Integer)current.fruit[1] > value){
                        prev = current;
                        current = current.next;
                    }
                    if(prev != null){
                        newN.next = current;
                        prev.next = newN;
                    }
                }
            }
        }
    }

}
