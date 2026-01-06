package com.example.map;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.stream.BaseStream;

@Mapper
public interface UserMapper extends BaseMapper<User> {


}
