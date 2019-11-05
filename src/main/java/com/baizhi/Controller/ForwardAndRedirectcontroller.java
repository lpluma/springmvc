package com.baizhi.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("forwardAndRedirect")
public class ForwardAndRedirectcontroller {
    /*
    * redirect 跳转controller 类中不同方法
    *  使用关键字redirect：使用语法:return "redirect:/跳转类
    *  @requestMapping 跳转类方法上 @requestMapping
    * */
        @RequestMapping("test1")
    public String test1(){
            System.out.println("test1");
            return  "redirect:/hello/hello";
        }

        /*
        * 使用forward跳转到相同controller类中不同方法
        *使用springmvcu关键字 ：forward
        * 语法：return “forward:跳转类上@requestMapping的路径/要跳转类中方法@requestMapping的路径"
        *
        * */

        /*
        * redirect 跳转到页面
        * 注意:使用springmvc关键字 redirect:使用语法
        *   return "redirect:index.jsp;
        *   注意：重定向跳转页面不会经过视图解析器
        *
        *
        * return "redirect:/index.jsp";
        * 注意：重定向跳转页面不会经过视图解析器
        *
        * */

        /*
        * 测试forward跳转到页面
        * 默认跳转forward
        *
        * */
        @RequestMapping ("test0")
        public String test(){
            System.out.println("test0");
            return "index";
        }

        @RequestMapping("test2")
        public String test2(){
            System.out.println("test2");
            return  "redirect:/index.jsp";
        }

        /*
        * 测试forward跳转页面
        * 默认跳转forward
        * */
        @RequestMapping("test3")
    public String test3(){
            System.out.println("test3");
            return  "index";
        }
}




