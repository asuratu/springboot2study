package com.heima.controller;

import lombok.Data;
import org.springframework.stereotype.Component;


/**
 * @author asura
 */
@Component
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
}
