package poc.properties.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyApplication {

	public DependencyApplication()
	{
		System.out.println("=========  DEPENDENCY CONSTRUCTOR +++++++++++");
	}

	public static void main(String[] args) {
		SpringApplication.run(DependencyApplication.class, args);
	}

}
