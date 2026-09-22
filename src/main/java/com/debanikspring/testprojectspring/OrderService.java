package com.debanikspring.testprojectspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    @Value("${stripe.stripe_url}")
    private String stripeUrl;

    @Value("${stripe.timeout}")
    private int timeout;

    public OrderService(){}

    @Autowired
    public OrderService(@Qualifier("paypal") PaymentService paymentService){
        this.paymentService=paymentService;
    }
    public void placeOrder(){
        System.out.println("the url is "+ stripeUrl+" and the timeout is "+timeout);
        paymentService.processPayment(10);
    }



//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
}
