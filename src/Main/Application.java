package Main;

import DatabaseConnection.DbConnection;
import Exceptions.ProviderExistException;
import ProductMgt.Product;
import ProductMgt.Products;
import ProviderMgt.Provider;
import ProviderMgt.Providers;
import customerMgt.Customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {//throws ProviderExistException {
        //créer un Customer ayant comme firstName "Mohamed" et comme lastName "Ben Salah"
     /*   Customer c1=new Customer();//l'instantiation (la reservation d'un espace mémoire)
        c1.setFirstName("Mohamed");
        c1.setLastName("Ben Salah");
        System.out.println(c1);

        Customer c2=new Customer();//l'instantiation (la reservation d'un espace mémoire)
        c2.setFirstName("Ahmed");
        c2.setLastName("Ben mohamed");
        System.out.println(c2);
        List<Customer> customers=new ArrayList<>();
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
        //test of lombok library use
//        Product p1=new Product();
//        p1.setLabel("Product 1");
//        p1.setExpiredDate(LocalDate.of(2022,11,12));
//        p1.setFabricationDate(LocalDate.of(2021,11,12));
//        System.out.println(p1);
//test of trim method
//        String ch="     abc efh     ";
//        System.out.println("size before trim = "+ch.length());
//        ch=ch.trim();
//        System.out.println("size after trim = "+ch.length());

//test of addProduct
//        Products products=new Products();
//        Providers providers=new Providers();
//        Product p1=new Product();
//        p1.setLabel("Delice milk");
//        p1.setPrice(new BigDecimal(15.5));
//        p1.setFabricationDate(LocalDate.of(2021,12,15));
//        p1.setExpiredDate(LocalDate.of(2022,12,15));
//        Provider prov1=new Provider();
//        prov1.setName("Delice");
//        prov1.setEmail("delice.tunisia@delice.tn");
//        p1.setProductProvider(prov1);
//        providers.add(prov1);
//        products.addProduct(p1,providers);

        //test of exception propagation case
//        Providers providers=new Providers();
//
//        Provider pr1=new Provider();
//        pr1.setName("Mercedes");
//        pr1.setEmail("mercedes.benz@ben.de");
//        try{
//            providers.add(pr1);
//            Provider pr2=new Provider();
//            pr2.setName("BMW");
//            pr2.setEmail("bmw.xyz@bmw.de");
//            providers.add(pr2);
//        }
//        catch(ProviderExistException e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println("End of the application.");

        //test of the connection to storedb Database
        DbConnection.getDbConnection();
    }
}
