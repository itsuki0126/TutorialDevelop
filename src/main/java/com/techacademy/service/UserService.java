package com.techacademy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techacademy.entity.User;
import com.techacademy.repository.UserRepository;

@Service
public class UserService {
    //フィールドの宣言
    private final UserRepository userRepository;

    //コンストラクタ
    public UserService(UserRepository repository) {
        this.userRepository = repository;
    }

    //全件を検索して返す
    public List<User> getUserList(){
        //リポジトリのfindAllメソッドを呼び出す
        return userRepository.findAll();
    }

}