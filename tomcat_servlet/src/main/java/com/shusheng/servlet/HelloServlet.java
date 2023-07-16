package com.shusheng.servlet;

import com.shusheng.ReaderBodyHttpServletRequest;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RequestWrapper;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    /*fetch(new Request('http://127.0.0.1:8080/hello_servlet/hello',{
        method:'POST',
                headers: {'Content-Type': 'application/json'},
        body:'{\"param\":\"value\"}'
    })).then((resp)=>{console.log(resp)});*/
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 测试网页请求，接收中文，不会乱码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        //不要调用父类的构造方法
        //super.doGet(req, resp);

        String appId = req.getHeader("appId");
        System.out.println(appId);

        ReaderBodyHttpServletRequest requestBody = (ReaderBodyHttpServletRequest) req;
        String requestBody1 = requestBody.getRequestBody();
        System.out.println(requestBody1);


        //控制台输出hello world
        System.out.println("调用HelloServlet1的doPost()");
        //放入响应的body中，页面就能显示hello world了
        resp.getWriter().write("这是世界开始的地方 --- doPost"+ System.currentTimeMillis() + "当前时间" + getTime());
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //不要调用父类的构造方法
        //super.doGet(req, resp);

        System.out.println("调用HelloServlet1的doGet()");
        // 通过servlet的servletConfig对象获取配置文件中sevlet-name的
        ServletConfig config = getServletConfig();
        String servletName = config.getServletName();
        System.out.println("servlet-name的值为：" + servletName);
        // 获取配置文件中init-param的值
        String username = config.getInitParameter("username");
        String password = config.getInitParameter("password");
        System.out.println("初始化用户名为：" + username);
        System.out.println("初始化密码为：" + password);



/*        String ss= null;
        System.out.println("this is null！"+ss.length());*/
        // 下面两行解决中文不再是乱码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        //放入响应的body中，页面就能显示hello world了
        resp.getWriter().write("这是世界开始的地方 --- doget!!!"+ "当前时间"+getTime());

    }


    private String getTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
        String dataStr = dateFormat.format(new Date());
        System.out.println(dataStr);
        return dataStr;
    }
}
