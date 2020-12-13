package com.practicing.usermanager;

import com.practicing.usermanager.constant.FileConstant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.File;

import static com.practicing.usermanager.constant.FileConstant.*;

@SpringBootApplication
public class UsermanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsermanagerApplication.class, args);
        new File(USER_FOLDER).mkdirs();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
