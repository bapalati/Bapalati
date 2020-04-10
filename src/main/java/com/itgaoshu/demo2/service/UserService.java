package com.itgaoshu.demo2.service;


import com.itgaoshu.demo2.bean.Tuser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<Tuser> selectUsers();
}
