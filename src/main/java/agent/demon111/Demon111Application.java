package agent.demon111;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("agent.demon111.mapper")
public class Demon111Application {

	public static void main(String[] args) {
		SpringApplication.run(Demon111Application.class, args);
	}

}
