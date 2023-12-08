package com.example.multiple.service;

import com.example.multiple.mappers.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    LoginMapper loginMapper;

    public String idCheck(String userid){
        int result = loginMapper.idCheck(userid);

        String str = "";
        if(result > 0){
            str = "사용불가";
        }else {
            str = "사용가능";
        }

        return str;
    }
}
