public class task0b{
    public static void main(String [] args){
        Graph [] list = new Graph[7];
        add(0,1,list);
        add(1,2,list);
        add(2,3,list);
        add(3,4,list);
        add(4,5,list);
        add(5,6,list);
        add(6,0,list);
        add(0,5,list);
        add(0,4,list);
        add(0,3,list);
        add(0,2,list);
        add(1,6,list);
        add(1,4,list);
        add(1,3,list);
        add(2,5,list);
        add(3,5,list);
        print(list);
        System.out.println();
        System.out.println("Vertex with max degree is (Adjacency list): "+ max_deg(list));
        System.out.println();
    }

    //task0b
    public static void add(int src, int dest, Graph list[]){
        Graph newG = new Graph(src,dest);
        if(list[src]==null){
            list[src]=newG;
        }
        else{
            Graph temp = list[src];
            boolean isFound = false;
            while(temp!=null){
                if(temp.dest==newG.dest){
                    isFound= true;
                    return;
                }
                temp=temp.next;
            }
            if(isFound==false){
                newG.next = list[src];
                list[src] = newG;
            }
        }
       
        Graph newG1 = new Graph(dest,src);
        if(list[dest]==null){
            list[dest]=newG1;
        }
        else{
            Graph temp = list[dest];
            boolean isFound = false;
            while(temp!=null){
                if(temp.dest==newG1.dest){
                    isFound= true;
                    return;
                }
                temp=temp.next;
            }
            if(isFound==false){
                newG1.next = list[dest];
                list[dest] = newG1;
            }
        }
    }

    public static void print(Graph list[]){
        for(int i=0; i<list.length;i++){
            Graph temp = list[i];
            System.out.print(i+ ": ");
            if (temp == null) {
                System.out.println();
                continue;
            }
            while(temp != null){
                System.out.print(temp.dest);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("-->");
                }
            }
            System.out.println();
        }
    }

    //task1b
    public static int max_deg(Graph []list){

       int max_count=0;
       int max_index =-1;
       for(int i=0; i<list.length;i++){
            int count =0;
            Graph temp = list[i];
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            if(count>max_count){
                max_count = count;
                max_index = i;
            }
        }
        return max_index;
        
    }

}