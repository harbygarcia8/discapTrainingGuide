package com.discaptraining.apimedicalhistory.service;

import com.discaptraining.apimedicalhistory.domain.entity.DiscapUser;
import com.discaptraining.apimedicalhistory.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    public DiscapUser saveDiscapUser(DiscapUser bodyDiscapUsers){
        return userRepository.save(bodyDiscapUsers);
    }

    public List<DiscapUser> getDiscapUserRegisterType(String registerType){
        return userRepository.findByDiscapUserRegisterType(registerType);
    }
}
