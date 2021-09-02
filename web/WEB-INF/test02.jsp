<%--
  Created by IntelliJ IDEA.
  User: 刘顺顺
  Date: 2021/8/31
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
我是test02，我的目录是：web/WEB-INF/test02.jsp
WEB-INF 是一个受保护的目录，外界用户无法直接访问，需要servlet转发才能访问
不能直接访问,那怎么办呢？、、
刚刚讲过的模型， 所有的servlet 请求 都需要一个总的servlet 来处理
那么这个总的servlet 是谁提供的呢？？   springMVC 框架提供的，路径是 org.springframework.web.servlet.DispatcherServlet
名字就叫做：DispatcherServlet.java   负责接收所有外界的req请求。 即：所有的 req请求都要进行统一管理，相当于一个城市的必经之路入口
</body>
</html>
