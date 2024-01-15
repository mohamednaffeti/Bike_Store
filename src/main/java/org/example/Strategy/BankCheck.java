package org.example.Strategy;

public class BankCheck implements PaymentMethod{
    @Override
    public void paymentMethod() {
        System.out.println("Bank Check Paiement");
    }
}
