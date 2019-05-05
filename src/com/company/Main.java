package com.company;

import com.company.factory.framework.Factory;
import com.company.factory.framework.Product;
import com.company.factory.idcard.IDCArdFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Factory factory=new IDCArdFactory();
        Product card1=factory.create("小明");
        Product card2=factory.create("小红");
        Product card3=factory.create("小绿");
        card1.use();
        card2.use();
        card3.use();

    }
}
