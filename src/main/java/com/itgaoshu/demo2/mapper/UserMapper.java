package com.itgaoshu.demo2.mapper;


import com.itgaoshu.demo2.bean.Tuser;

import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UserMapper extends Mapper<Tuser>{
    @Select("select * from tuser")
    public List<Tuser> selectUsers();
}
