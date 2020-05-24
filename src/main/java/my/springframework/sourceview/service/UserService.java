package my.springframework.sourceview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private OrderService orderService;

    public UserService() {
        System.out.println("UserService constructor created");
    }

}
