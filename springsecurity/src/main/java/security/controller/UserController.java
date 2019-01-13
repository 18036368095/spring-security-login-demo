package security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

   @RequestMapping("/")
   public String index() {
       return "index";
   }

   @RequestMapping("/hello")
   public String hello() {
       return "hello";
   }

   @RequestMapping("/user/login")
    public ModelAndView login() {
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("login");
       return modelAndView;
   }


   @RequestMapping("/login/fail")
   public ModelAndView loginFail() {
       return new ModelAndView("login-fail");
   }


}
