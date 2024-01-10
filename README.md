## JavaWeb整理
### 记录JavaWeb(JSP+Servlet)的学习过程
#### 关于tomcat的一些知识点
1. JavaWeb的程序是运行在Tomcat这个Web容器里面的
2. Tomcat是一个Web容器，它的作用是用来运行JavaWeb程序的
3. Tomcat是一个Web服务器，它的作用是用来处理HTTP协议的请求的
4. Tomcat是一个Servlet容器，它的作用是用来运行Servlet程序的
5. Tomcat是一个JSP容器，它的作用是用来运行JSP程序的
6. Tomcat是一个J2EE容器，它的作用是用来运行J2EE程序的
7. Tomcat是一个Servlet/JSP容器，它的作用是用来运行Servlet/JSP程序的
#### JSP的九大内置对象
1. request：请求对象，代表客户端的请求，包含了请求的信息
2. response：响应对象，代表服务器的响应，包含了响应的信息
3. session：会话对象，代表客户端和服务器的一次会话，一次会话中有多次请求和响应
4. application：代表当前的Web应用，一般用来保存全局的数据
5. out：输出对象，用来输出数据的
6. config：配置对象，代表当前JSP的配置
7. page：当前页面本身（相当于Java中的this）
8. pageContext：代表当前页面，可以获取其他八个内置对象
9. exception：异常对象，代表当前页面出现的异常
#### Servlet的生命周期
1. Servlet的生命周期：从Servlet被创建到Servlet被销毁的过程
2. Servlet的生命周期由服务器来管理
3. Servlet的生命周期中有三个方法：init()、service()、destroy()
4. init()：在Servlet被创建时执行，只执行一次，用来加载资源
5. service()：每次请求Servlet时执行，执行多次，用来处理请求
6. destroy()：在Servlet被销毁时执行，只执行一次，用来释放资源
7. Servlet的生命周期中只有service()方法是必须执行的，其他两个方法不是必须执行的
8. Servlet的生命周期中只有init()方法和destroy()方法是只执行一次的，service()方法是执行多次的
#### Servlet的三种创建方式
1. 实现Servlet接口
2. 继承GenericServlet类
3. 继承HttpServlet类
#### Servlet的配置
1. Servlet的配置有两种方式：注解配置和web.xml配置
2. 注解配置：在Servlet的类上面使用@WebServlet注解来配置Servlet
3. web.xml配置：在web.xml文件中使用<servlet>和<servlet-mapping>标签来配置Servlet
#### 重定向和转发
1. 重定向：response.sendRedirect("index.jsp");
2. 转发：request.getRequestDispatcher("index.jsp").forward(request, response);
3. 重定向和转发的区别：
    1. 重定向是两次请求，转发是一次请求
    2. 重定向可以访问其他站点的资源，转发只能访问当前站点的资源
    3. 重定向可以访问WEB-INF目录下的资源，转发不能访问WEB-INF目录下的资源
    4. 重定向可以访问任意类型的资源，转发只能访问Servlet和JSP资源
### 关于JavaWeb其他的总结
#### jar包引用和配置文件(web.xml)的创建
1. jar包的引用有两种方式：本地引用和网络引用
2. 本地引用：将jar包放到WEB-INF/lib目录下
3. 网络引用：将jar包放到WEB-INF/lib目录下，然后在项目中右键选择Build Path->Configure Build Path->Libraries->Add JARs...->选择jar包->Apply and Close
4. 配置文件的创建：在WEB-INF目录下创建web.xml文件
#### 客户端和服务器的路径
1. 客户端路径：客户端指的是浏览器，客户端路径指的是浏览器的地址栏中输入的路径
2. 服务器路径：服务器指的是Tomcat，服务器路径指的是Tomcat的webapps目录下的项目名称
3. 客户端路径的获取：request.getContextPath()
4. 服务器路径的获取：request.getServletPath()
5. 两者均使用绝对路径
#### MVC设计模式
1. MVC设计模式：Model-View-Controller，模型-视图-控制器
2. Model：模型，负责处理业务逻辑，由JavaBean来实现
3. View：视图，负责展示数据，与用户进行交互，由Servlet和JSP来实现
4. Controller：控制器，负责接收请求，调用模型，转发视图，由Servlet来实现
5. MVC设计模式的好处：降低了耦合度，提高了代码的可维护性
#### JAVAEE的三层架构
1. web层：负责接收请求，调用业务逻辑层，转发视图（包含Controller层和View）
2. service层：负责处理业务逻辑，调用数据访问层
3. dao层：负责操作数据库
4. 三层架构的好处：降低了耦合度，提高了代码的可维护性

#### request和response的区别
1. request：请求对象，代表客户端的请求，包含了请求的信息
2. response：响应对象，代表服务器的响应，包含了响应的信息
3. request和response的区别：
    1. request是HttpServletRequest类型的，response是HttpServletResponse类型的
    2. request是从客户端到服务器，response是从服务器到客户端
    3. request是请求的信息，response是响应的信息
    4. request是请求的参数，response是响应的结果
    5. request是请求的头，response是响应的头
    6. request是请求的方法，response是响应的方法
    7. request是请求的协议，response是响应的协议
    8. request是请求的URL，response是响应的URL
    9. request是请求的URI，response是响应的URI
    10. request是请求的IP，response是响应的IP
    11. request是请求的端口，response是响应的端口
    12. request是请求的ServletPath，response是响应的ServletPath
    13. request是请求的ContextPath，response是响应的ContextPath
    14. request是请求的QueryString，response是响应的QueryString
    15. request是请求的Session，response是响应的Session
    16. request是请求的Cookie，response是响应的Cookie
    17. request是请求的Attribute，response是响应的Attribute
    18. request是请求的Parameter，response是响应的Parameter
    19. request是请求的InputStream，response是响应的OutputStream
    20. request是请求的Reader，response是响应的Writer
    21. request是请求的Locale，response是响应的Locale
    22. request是请求的CharacterEncoding，response是响应的CharacterEncoding
    23. request是请求的ContentType，response是响应的ContentType
    24. request是请求的ContentLength，response是响应的ContentLength
    25. request是请求的Content，response是响应的Content
    26. request是请求的Header，response是响应的Header
#### request.setAttribute()和request.getAttribute()的使用
1. request.setAttribute()：向request域中存储数据
2. request.getAttribute()：从request域中获取数据
3. request.setAttribute()和request.getAttribute()的使用：
    1. request.setAttribute()：request.setAttribute("name", "zhangsan");
    2. request.getAttribute()：String name = (String) request.getAttribute("name");
#### 请求转发和请求包含
1. 请求转发：request.getRequestDispatcher("index.jsp").forward(request, response);
2. 请求包含：request.getRequestDispatcher("index.jsp").include(request, response);
3. 请求转发和请求包含的区别：
    1. 请求转发是一次请求，请求包含是多次请求
    2. 请求转发只能访问当前站点的资源，请求包含可以访问其他站点的资源
    3. 请求转发可以访问WEB-INF目录下的资源，请求包含不能访问WEB-INF目录下的资源
    4. 请求转发可以访问任意类型的资源，请求包含只能访问Servlet和JSP资源
#### request.getParameter()和request.getParameterValues()的使用
1. request.getParameter()：获取请求参数的值
2. request.getParameterValues()：获取请求参数的值，如果有多个值，返回一个数组
3. request.getParameter()和request.getParameterValues()的使用：
   1. request.getParameter()：String name = request.getParameter("name");
   2. request.getParameterValues()：String[] names = request.getParameterValues("name");
#### EL表达式的使用
1. Expression Language，用来获取域对象中的数据：
   1. ${域对象.键名}
   2. 例如：
   3. 设置:request.setAttribute("name","xzc");
   4. 取用:${requsetScope.name}
2. EL表达式不指定范围时取用数据的顺序：
   1. pageContext
   2. request
   3. session
   4. application
3. EL表达式取用对象：
   1. ${域对象.键名.属性名}
   2. 例如：
   3. 设置:request.setAttribute("user",new User("xzc",18));
   4. 取用:${requestScope.user.name}（对象必须有get方法）
4. EL表达式取用Map：
   1. ${域对象.键名.键名}
   2. 例如：
   3. 设置:request.setAttribute("map",new HashMap<String,String>());
   4. 取用:${requestScope.map.key}
5. EL表达式取用List：
   1. ${域对象.键名`[索引]`}
   2. 例如：
   3. 设置:request.setAttribute("list",new ArrayList<String>());
   4. 取用:${requestScope.list`[0]`}
#### JSTL的使用
1. JSP Standard Tag Library，JSP标准标签库，用来简化JSP开发
2. JSTL的使用：
   1. 引入JSTL的jar包
   2. 引入JSTL的标签库：<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   3. 使用JSTL的标签：`<c:标签名></c:标签名>`
3. JSTL的标签：
   1. `<c:out>`：用来输出数据的：
        1. `<c:out value="zhangsan"/>`
        2. `<c:out value="${name}"/>`
   2. `<c:set>`：用来设置数据的：
        1. `<c:set var="name" value="zhangsan"/>`
        2. `<c:set target="request" property="name" value="zhangsan"/>`
   3. `<c:remove>`：用来移除数据的：
        1. `<c:remove var="name"/>`
        2. `<c:remove target="request" property="name"/>`
   4. `<c:if>`：用来判断条件的：
        1. `<c:if test="${name == 'zhangsan'}">`
        2. `<c:if test="${name == 'zhangsan'}">`
   5. `<c:choose>`：用来选择条件的:
        1. `<c:choose>`
        2. `<c:when test="${name == 'zhangsan'}">`
        3. `<c:otherwise>`
        4. `</c:choose>`
   6. `<c:forEach>`：用来遍历集合的：
        1. `<c:forEach items="${list}" var="name">`
        2. `<c:forEach items="${list}" var="name" begin="0" end="5">`
        3. `<c:forEach items="${list}" var="name" step="2">`
   7. `<c:forTokens>`：用来遍历字符串的
   8. `<c:import>`：用来导入数据的
   9. `<c:redirect>`：用来重定向的
   10. `<c:url>`：用来获取URL的
   11. `<c:param>`：用来设置参数的
   12. `<c:catch>`：用来捕获异常的

