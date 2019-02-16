package com.ankit.bootpractise.services;

import com.ankit.bootpractise.data.entities.UserEntity;
import com.ankit.bootpractise.data.repo.ProductRepository;
import com.ankit.bootpractise.data.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ProductRepository productRepository;

    @Transactional
    public void changeName(String name) throws IllegalAccessException {
        System.out.println("In change Name method");
        Optional<UserEntity> userEntity = userRepository.findById(100L);
        UserEntity user = userEntity.orElse(new UserEntity(1L, "Ankit"));
        this.changeProductName("ProductName", user);
    }

    @javax.transaction.Transactional(javax.transaction.Transactional.TxType.REQUIRED)
    public void changeProductName(String productName, UserEntity user) throws IllegalAccessException {
        System.out.println("Received User: "+ user);
        productRepository.findByProductName(productName);
        throw new IllegalAccessException();
    }

}
