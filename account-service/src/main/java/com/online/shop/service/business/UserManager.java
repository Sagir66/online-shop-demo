package com.online.shop.service.business;
import com.online.shop.service.core.utilities.results.Results;
import com.online.shop.service.core.utilities.results.SuccesDataResults;
import com.online.shop.service.core.utilities.results.SuccessResult;
import com.online.shop.service.userDao.UserRepo;
import com.online.shop.service.domain.User;
import lombok.extern.log4j.Log4j2;
import org.jvnet.hk2.annotations.Service;


import java.util.List;

/**
 * Created By ->  Ismail Sagir on 25.01.23
 * Project Name -> online-shop-service
 */
@Service
@Log4j2
public class UserManager implements UserServices  {

    private final UserRepo userRepo;

    public UserManager(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @Override
    public List<User> getAll() {
        log.atInfo();
        return userRepo.findAll();
    }

    @Override
    public void addAll(User usr) {
     userRepo.save(usr);
    }
}