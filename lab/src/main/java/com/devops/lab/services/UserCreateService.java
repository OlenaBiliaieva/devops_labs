package com.devops.lab.services;

import com.devops.lab.db.tables.repositories.UserRepository;
import com.devops.lab.db.tables.user.User;
import com.devops.lab.dto.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserCreateService {

    @Autowired
    private UserRepository repository;

    public Optional<User> getUserInfo(long id) {
        return repository.findById(id);
    }

    public boolean creteUser(UserInfo info) {
        repository.save(User.builder()
                .userName(info.getUserName())
                .email(info.getEmail())
                .jobTitle(info.getJobTitle())
                .build());
        return true;
    }

}
