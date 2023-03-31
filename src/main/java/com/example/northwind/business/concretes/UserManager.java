package com.example.northwind.business.concretes;

import com.example.northwind.business.abstracts.UserService;
import com.example.northwind.core.dataAccess.UserDao;
import com.example.northwind.core.entities.User;
import com.example.northwind.core.utilities.result.DataResult;
import com.example.northwind.core.utilities.result.Result;
import com.example.northwind.core.utilities.result.SuccessDataResult;
import com.example.northwind.core.utilities.result.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;

public class UserManager implements UserService {
    private UserDao userDao;


    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı eklendi.");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByEmail(email), "Kullanıcı bulundu.");
    }
}
