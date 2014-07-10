package ua.epam.example.springrest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class HelloController {

	@RequestMapping(value = "/{user}", method = RequestMethod.GET)
	public @ResponseBody Hello getMovie(@PathVariable String name) {
 
		return new Hello(name);
 
	}
}
