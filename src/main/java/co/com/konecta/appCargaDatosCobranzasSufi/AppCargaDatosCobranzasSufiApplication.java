package co.com.konecta.appCargaDatosCobranzasSufi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.konecta.appCargaDatosCobranzasSufi.entity.User;
import co.com.konecta.appCargaDatosCobranzasSufi.service.UserService;

@SpringBootApplication
public class AppCargaDatosCobranzasSufiApplication {


	public static void main(String[] args) {
		
		try {

			SpringApplication.run(AppCargaDatosCobranzasSufiApplication.class, args);
			
			/*UserService cs = context.getBean("userService", UserService.class);

			User user = cs.authenticateUser("admin", "admin");

			if (user.getName() != null) {

				System.out.println("Usuario autenticado: " + user.getName());
			}*/

		} catch (Exception ex) {

			System.out.println("error: " + ex.getMessage());
		}
	}

}
