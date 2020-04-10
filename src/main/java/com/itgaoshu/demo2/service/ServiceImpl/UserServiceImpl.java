package com.itgaoshu.demo2.service.ServiceImpl;


import com.itgaoshu.demo2.bean.Tuser;
import com.itgaoshu.demo2.mapper.UserMapper;
import com.itgaoshu.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    /*@Cacheable("selectUsers")*/
    public List<Tuser> selectUsers(){
        return userMapper.selectAll();
    }
}
