package ProviderMgt;

import Exceptions.ProviderExistException;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Providers {
    private List<Provider> providers=new ArrayList<>();

    public void add(Provider p)throws ProviderExistException
    {
        //try {
            if (providers.contains(p))
                throw new ProviderExistException("This provider already exist");
            providers.add(p);
        System.out.println("Provider with id = "+ p.getId()+" has been successfully added");
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }
}
