package my.springframework.sourceview;

import my.springframework.sourceview.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringFrameworkApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(AppConfig.class);
        ac.refresh();

        OrderService orderService = ac.getBean("orderService", OrderService.class);
        System.out.println(orderService);

    }
}
