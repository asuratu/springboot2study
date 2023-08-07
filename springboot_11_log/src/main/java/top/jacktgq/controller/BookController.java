package top.jacktgq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author asura
 */
@RestController
@RequestMapping("/books")
public class BookController {
    // 创建记录日志的对象
    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @GetMapping("/getById")
    public String getById() {
        System.out.println("springboot is running...");
        log.trace("log trace"); // 堆栈信息, 一般不用
        log.debug("log debug ..."); // 调试信息
        log.info("log info ..."); // 重要信息
        log.warn("log warn ..."); // 警告信息
        log.error("log error ..."); // 错误信息
        return "springboot is running...";
    }
}
