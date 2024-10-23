package cn.edu.ujn.ch12.c;

import cn.edu.ujn.ch12.m.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(ModelMap model) {
        model.addAttribute("msg", "这是我的第一个带注解的SpringMVC");
        return "first";
    }

    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(User user){
        System.out.println("user = " + user);
        if("wutao".equals(user.getUsername())){
            return "ok";
        }else {
            return "index";
        }
    }
}
