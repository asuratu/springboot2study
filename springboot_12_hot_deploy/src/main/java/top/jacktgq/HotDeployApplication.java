package top.jacktgq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author asura
 */
@SpringBootApplication
public class HotDeployApplication {

    public static void main(String[] args) {
        // 这里修改配置, 可以防止其他地方的配置相互覆盖
        // 这里的配置可以保证热部署失效
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(HotDeployApplication.class, args);
    }

}
