package com.company.builder;

public class Demo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount
                .Builder(1234L)
                .atRate(2.5)
                .atBranch("TEST BRANCH")
                .build();


        BankAccount account1 = new BankAccount
                .Builder(1111L)
                .withOwner("TEST OWNER")
                .openingBalance(100)
                .build();


        System.out.println(account);
        System.out.println();
        System.out.println(account1);


    }
}
