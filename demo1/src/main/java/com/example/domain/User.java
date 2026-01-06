package com.example.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("user")
public class User {
    private Integer user_id;
    private String username;
    private String password;
    private LocalDateTime create_at;

}
