package org.example.Strategy;

public class BikePaiementContext {
    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void PaimentMethod(){
        paymentMethod.paymentMethod();
    }
}
