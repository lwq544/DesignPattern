package com.company.factory.idcard;

import com.company.factory.framework.Factory;
import com.company.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCArdFactory extends Factory {
    private List owners=new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners(){
        return owners;
    }
}
