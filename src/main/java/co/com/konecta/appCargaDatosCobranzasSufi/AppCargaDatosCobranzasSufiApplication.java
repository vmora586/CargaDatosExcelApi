package co.com.konecta.appCargaDatosCobranzasSufi;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(basePackageClasses = { 
		AppCargaDatosCobranzasSufiApplication.class,
		Jsr310JpaConverters.class 
})
public class AppCargaDatosCobranzasSufiApplication {

	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AppCargaDatosCobranzasSufiApplication.class, args);
	}

}
