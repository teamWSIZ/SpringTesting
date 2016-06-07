package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import service.Rest;


@Controller
@EnableWebMvc
public class UserController {

    @RequestMapping(value = "/")
    @ResponseBody
    public Rest saySomething() {
        return new Rest();
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public Rest getAllHosts() {
        Rest odp = new Rest();
        odp.setResult("Abra kadabra");
        return odp;
    }

}
