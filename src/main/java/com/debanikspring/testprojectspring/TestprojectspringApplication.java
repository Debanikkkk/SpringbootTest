//package com.debanikspring.testprojectspring;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class TestprojectspringApplication {
//
//    private final OrderService orderService;
//    public static void main(String[] args) {
//
//        SpringApplication.run(TestprojectspringApplication.class, args);
//    var orderService=new OrderService(new PaypalPaymentService()  );
//            var orderService=new OrderService();
//
//            orderService.setPaymentService(new PaypalPaymentService()
//            );
//        orderService.placeOrder(PaymentService.class);
//            orderService.placeOrder();
//    }
//
//}
package com.debanikspring.testprojectspring;

import com.debanikspring.testprojectspring.notification_exercise.MainNotifService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestprojectspringApplication {

    public static void main(String[] args) {

        var context =
                SpringApplication.run(TestprojectspringApplication.class, args);

        var orderService = context.getBean(OrderService.class);

        orderService.placeOrder();

        var notifService=context.getBean(MainNotifService.class);
        notifService.sendNotif("hey there this is a message from debanik");
    }
}