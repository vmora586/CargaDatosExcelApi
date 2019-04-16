package co.com.konecta.appCargaDatosCobranzasSufi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String HelloWorld(@RequestParam(value="name",defaultValue="Victor")String name) {
		return "Hello: "+name;
	}
}
