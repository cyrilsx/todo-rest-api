package ch.collen.todo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cyril on 16/10/17.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello " + name;
    }

}
