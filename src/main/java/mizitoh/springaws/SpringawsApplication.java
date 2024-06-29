package mizitoh.springaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class SpringawsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringawsApplication.class, args);
	}

}

@RestController
class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "<h1>ASMEI 20</h1>";
	}
}
