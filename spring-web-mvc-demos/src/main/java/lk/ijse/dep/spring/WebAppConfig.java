package lk.ijse.dep.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("lk.ijse.dep.spring")
@Configuration
public class WebAppConfig {
}
