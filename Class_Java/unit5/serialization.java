// serialization is the process by which we can convert an object into byte string so that it can easily transfer by a networks, store in file and database also for caching 
// to convert byte string into object the process of reversing serialization means byte string to object is known as deserialization 

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Employee implements Serializable {
    // if we implements any class with Serializable then 
    // we are declaring that it can convert into byte stream 
    int empId;   // variable empIDd is never read
    String EmpName;  //variable EmpName is never read 

    public Employee(int empId, String EmpName){
        this.empId = empId;
        this.EmpName = EmpName;  
    }
}

public class serialization {
    public static void main(String[] args) {
        Employee e1 = new Employee(21,"John");

        // ObjectOutputStream : to convert object into byte and store it into file 

        try {
            FileOutputStream fos = new FileOutputStream("employee.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(e1);
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}