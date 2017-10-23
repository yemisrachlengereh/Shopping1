package com.company;
import java.util.ArrayList;
public class ShoppingCart {

    ArrayList<String> groceryItems= new ArrayList<>();
    private String Cartitemlist;

    public String getCartitemlist() {
        return Cartitemlist;
    }

    public void setCartitemlist(String cartitemlist) {
        Cartitemlist = cartitemlist;
    }
}
