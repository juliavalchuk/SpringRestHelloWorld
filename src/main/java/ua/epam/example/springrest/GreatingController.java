package ua.epam.example.springrest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class GreatingController {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping(value = "/{user}", method = RequestMethod.GET)
	public @ResponseBody Greeting getGreeting(@PathVariable String user) {
 
    	//System.out.println(user);
		return new Greeting(counter.getAndIncrement(),String.format(template, user));
 
	}
    
    @RequestMapping (method = RequestMethod.GET)
	public @ResponseBody Greeting getGreatingWorld() {
 
    	System.out.println("Word!");
		return new Greeting(counter.getAndIncrement(), String.format(template, "word"));
 
	}

}
