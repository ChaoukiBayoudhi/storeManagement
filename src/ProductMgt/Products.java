package ProductMgt;

import Exceptions.ProductLabelException;
import ProviderMgt.Providers;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private List<Product> productList=new ArrayList<>();
    public void addProduct(Product p1, Providers providers)
    {
        try {
            if (p1.getLabel() == null || p1.getLabel().trim().length() == 0)
                throw new ProductLabelException("The Label value is required and could not be empty.");
            if (p1.getPrice() == null)
                throw new Exception("The Price value is required.");
            if (p1.getExpiredDate() == null || p1.getFabricationDate() == null)
                throw new Exception("The Expired/Fabrication Date value are required");
            if(!providers.getProviders().contains(p1.getProductProvider()))
                throw new Exception("The provider of given product doesn't exist");
            productList.add(p1);
            System.out.println("Product with id= " + p1.getId() + " has been successfully added");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
