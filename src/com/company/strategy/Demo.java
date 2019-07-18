package com.company.strategy;

public class Demo {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item = new Item("1234", 45.6);
        Item item2 = new Item("5678", 17.2);

        shoppingCart.addItem(item);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new PaypalStrategy("test@example.com", "pass123"));

        shoppingCart.pay(new CreditCardStrategy("Test Test", "1234", "567", "20/02"));

    }
}
