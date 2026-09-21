package com.debanikspring.testprojectspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestprojectspringApplication {

    public static void main(String[] args) {

//        SpringApplication.run(TestprojectspringApplication.class, args);
//    var orderService=new OrderService(new PaypalPaymentService()  );
            var orderService=new OrderService();
            orderService.setPaymentService(new PaypalPaymentService());
            orderService.placeOrder();
    }

}
