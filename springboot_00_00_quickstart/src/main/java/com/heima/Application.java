package com.heima;

import com.heima.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author asura
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 可配置应用上下文
        ConfigurableApplicationContext ctx = SpringApplication.run (Springboot0101QuickstartApplication.class, args);
        // 获取 bean 的四种方式
        BookController bean = ctx.getBean(BookController.class);

        System.out.println("===========>" + bean);
    }

}
