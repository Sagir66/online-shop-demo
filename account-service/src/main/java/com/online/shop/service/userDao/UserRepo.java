package com.online.shop.service.userDao;

import com.online.shop.service.domain.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By ->  Ismail Sagir on 25.01.23
 * Project Name -> online-shop-service
 */
@Repository
@ComponentScan(basePackages = {"com.online.shop.service"})
@EnableMongoRepositories("com.online.shop.service.userDao")
public interface UserRepo extends MongoRepository<User,Long> {

    User getByUserName(String Username);
    List<User> getByUserNameWhitId(int id);
}
