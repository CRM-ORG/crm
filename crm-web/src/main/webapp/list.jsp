<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<body>
<h2>list</h2>
    <shiro:hasRole name="admin">
        <a href="/admin.jsp">admin</a>
        <br/><br/>
    </shiro:hasRole>
<shiro:hasRole name="user">
    <a href="/user.jsp">user</a>
    <br/><br/>
</shiro:hasRole>
    <a href="/shiro/logout">logout</a>
    <br/><br/>
    <a href="/shiro/testShiroAnnontain">测试</a>
</body>
</html>
