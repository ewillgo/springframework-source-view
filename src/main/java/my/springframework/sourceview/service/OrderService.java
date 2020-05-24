package my.springframework.sourceview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private UserService userService;

    public OrderService() {
        System.out.println("OrderService constructor created");
    }

    public UserService getUserService() {
        return userService;
    }
}
