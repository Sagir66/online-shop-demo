package com.online.shop.service.business;
import com.online.shop.service.domain.User;


import java.util.List;


public interface UserServices {
  List<User> getAll();
   void addAll(User usr);



}
