package cn.xlbweb.fly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author: Mr.X
 * @date: 2018/5/2 下午10:59
 * @description: @ServletComponentScan注解给Druid监控使用
 */
@SpringBootApplication
@ServletComponentScan
public class CmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsApplication.class, args);
    }
}
