package org.gayatri.SpringBootWebCalculator;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("home method called.....");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest request, HttpSession session){
//        System.out.println("add method called.....");

        int n1 = Integer.parseInt(request.getParameter("num1"));
        int n2 = Integer.parseInt(request.getParameter("num2"));
        int result = n1+n2;

        session.setAttribute("result", result);

        return "result.jsp";
    }
}
