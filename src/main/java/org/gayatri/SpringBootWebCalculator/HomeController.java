package org.gayatri.SpringBootWebCalculator;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("home method called.....");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int num, int num2, HttpSession session){
//        System.out.println("add method called.....");


        int result = num+num2;

        session.setAttribute("result", result);

        return "result.jsp";
    }
}
