import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName OauthServerApplication
 * @Author Vigoo
 * @Date 2021/2/19 14:14
 **/
@SpringBootApplication
@ComponentScan({"com.newhope.*"})
public class OauthServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OauthServerApplication.class, args);
    }
}
