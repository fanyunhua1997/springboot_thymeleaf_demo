package com.offcn.controller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: lhq
 * @Date: 2020/9/9 19:03
 * @Description:
 */

@Controller
public class FirstController {

    @RequestMapping("/indexPage")
    public String indexPage(Model model){

        model.addAttribute("message","Hello Thymeleaf!");

        return "index";
    }


    @RequestMapping("/findAll")
    public String findAll(Model model){

        List list=new ArrayList();

        for (int i=0;i<4;i++){
            User user = new User(i,"a"+i,i);

            list.add(user);
        }

        model.addAttribute("list",list);

        return  "index2";
    }

    @RequestMapping("/poingjie")
    public String pingjie(Model model){

        model.addAttribute("username","张三");



        return "index3";
    }

    @RequestMapping("/five")
    public String five(Model model){

        model.addAttribute("flag","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");

        return "index4";
    }

    @RequestMapping("/six")
    public String six(){

        return "index5";
    }


    @RequestMapping("/seven")
    public String seven(Model model){

        Date date = new Date();

        model.addAttribute("date",date);

        double price=128.4514;

        model.addAttribute("price",price);

        String str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;

        model.addAttribute("strText",str);

        String str2="JAVA-offcn";

        model.addAttribute("str2",str2);

        return "index6";
    }


}
