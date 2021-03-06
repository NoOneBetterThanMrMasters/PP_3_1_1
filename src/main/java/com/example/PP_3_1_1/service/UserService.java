package com.example.PP_3_1_1.service;

import com.example.PP_3_1_1.model.User;
import java.util.List;

public interface UserService {

    List<User> getListUsers();
    void add(User user);
    void delete(int id);
    void update(User user, int id);
    User getById(int id);

}
