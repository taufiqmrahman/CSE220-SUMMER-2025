/*You will have to complete the PairNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and remove()
 the rest of the methods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht is the HashTable array that stores the PairNode objects
    //It is an intance variable
    private PairNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change and DO NOT SUBMIT this method
    public HashTable(int size){
        this.ht = new PairNode[size];
    }

    //This method is called to insert each pair from the 2D Array
	//DO NOT change and DO NOT SUBMIT this method
    public void createFromArray(Object[][] arr){
        for( Object[] x: arr )
            this.insert( x );
    }

    //The insert() method inserts the pair into proper Hashed Index
	//This method is already written including collision resolve using Forward Chaining
	//DO NOT change and DO NOT SUBMIT this method
    public void insert(Object[] keyValuePair){
        Integer key = (Integer)keyValuePair[0];
        String value = (String)keyValuePair[1];

        int idx = hashFunction(key); 
        if ( idx==-1 ) {
            //leaving it blank
        } else if ( ht[idx]==null ){
            ht[idx] = new PairNode(key, value);
        } else {
            PairNode pair = new PairNode(key, value);
            pair.next = ht[idx];
            ht[idx] = pair;
        }
    }

    //This method basically prints the HashTable
	//DO NOT change and DO NOT SUBMIT this method
    public void printHashTable(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+": " );
            PairNode pNode = ht[i];
            if( pNode==null ) System.out.println("null");
            while (pNode!=null){
                System.out.print("("+pNode.key+", '"+pNode.value+"') --> ");
                if (pNode.next==null) System.out.println("null");
                pNode = pNode.next;
            }
        }
    }

	//you need to COMPLETE this method and MUST SUBMIT IT
    //Complete this method first the write remove
    private int hashFunction( Integer key ){
        int size = ht.length;
        int idx = (key+3)%size;
        return idx; 
    }

    public void remove( Integer key ){
        int idx = hashFunction(key);
        
        if((Integer)ht[idx].key==key){
            PairNode temp = ht[idx];
            ht[idx] = ht[idx].next;
            temp.next = null;
        }
        else{
            PairNode temp = ht[idx];
            while(temp.next!=null){
                if(temp.next.key == key){
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
    }

}
