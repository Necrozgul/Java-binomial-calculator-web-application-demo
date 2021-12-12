package com.example.znjxl9bin.controller;

import com.example.znjxl9bin.mymath.MyMath;
import com.example.znjxl9bin.mymath.MyMathRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpSession;

@Controller
public class WebController {

    @GetMapping("/")
    public String loadIndex(HttpSession session) {
        session.setAttribute("displayerror", "none");
        return "index.jsp";
    }

    @PostMapping("/bin")
    public String loginUser(@RequestParam("n") Integer n, @RequestParam("k") Integer k, HttpSession session) {
        if((n<0||n>15)||(k<0||k>15)) {
            session.setAttribute("displayerror", "block");
            return "index.jsp";
        }
        else
        {
            MyMath u = new MyMath(n,k);
            u.incraseCalcNumber();
            MyMathRepo.getInstance().addMath(u);
            session.setAttribute("math", u);
            int result=MyMath.bin(n,k);

            return "main.jsp";
        }
    }






}
