package cn.adminlog.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("cn.adminlog")
@EnableAspectJAutoProxy
public class SpringConfig {

}
