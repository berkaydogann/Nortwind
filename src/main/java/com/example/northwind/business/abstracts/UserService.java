package com.example.northwind.business.abstracts;

import com.example.northwind.core.entities.User;
import com.example.northwind.core.utilities.result.DataResult;
import com.example.northwind.core.utilities.result.Result;

public interface UserService {
    Result add(User user);

    DataResult<User> findByEmail(String email);
}
