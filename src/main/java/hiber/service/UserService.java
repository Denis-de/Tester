package hiber.service;

//import antlr.collections.List;
import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    User getUserByCar(String model, int series);
}
