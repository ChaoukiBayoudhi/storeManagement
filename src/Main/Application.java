package Main;

import customerMgt.Customer;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args){
        //créer un Customer ayant comme firstName "Mohamed" et comme lastName "Ben Salah"
        Customer c1=new Customer();//l'instantiation (la reservation d'un espace mémoire)
        c1.setFirstName("Mohamed");
        c1.setLastName("Ben Salah");
        System.out.println(c1);

        Customer c2=new Customer();//l'instantiation (la reservation d'un espace mémoire)
        c2.setFirstName("Ahmed");
        c2.setLastName("Ben mohamed");
        System.out.println(c2);
        /*List<Customer> customers=new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        System.out.println("Before remove : ");
        System.out.println(customers);
        //remove using index
        customers.remove(1);
        System.out.println("After remove : ");
        System.out.println(customers);
        customers.remove(c1);
        System.out.println("After remove : ");
        System.out.println(customers);
*/



    }
}
