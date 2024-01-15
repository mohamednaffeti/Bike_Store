package org.example.Strategy;

public class BankTransfer implements PaymentMethod{
    @Override
    public void paymentMethod() {
        System.out.println("Bank Transfer Paiement ");
    }
}
