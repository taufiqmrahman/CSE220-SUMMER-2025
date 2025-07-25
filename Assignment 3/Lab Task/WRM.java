public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient temp = dh.prev;
        Patient newP = new Patient(id, name, age, bloodgroup, dh,temp );
        dh.prev = newP;
        temp.next = newP;

    }

    public void servePatient() {
        Patient temp = dh.next;
        Patient temp2 = dh.next.next;
        dh.next = dh.next.next;
        temp2.prev = dh;
        temp.prev = null;
        temp.next = null;
    }

    public void showAllPatient() {
        Patient temp = dh.next;
        int count =1;
        while(temp!=dh){
            System.out.println(count + ": " + temp.name);
            temp = temp.next;
            count++;
        }
    }

    public Boolean canDoctorGoHome() {
        if(dh.prev == dh && dh.next == dh){
            return true;
        }
        return false;
    }

    public void cancelAll() {
        Patient temp = dh.next;
        Patient temp2 = dh.prev;
        dh.prev = dh;
        dh.next = dh;
        temp.prev = null;
        temp2.prev = null;

    }


    public void reverseTheLine() {
       
        Patient current = dh.next;
        Patient temp;

        while (current != dh) {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        }

        temp = dh.next; 
        dh.next = dh.prev;
        dh.prev = temp;
    }

}