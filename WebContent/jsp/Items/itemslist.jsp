<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ItemsList</title>
</head>
<body>
查询条件：
<table width="100%" border="1"><tr> <td> <input type="submit" value="查询"/></td></tr></table>
商品列表：
<table width="100%" border="1"><tr> 
<td>商品名称 </td>
<td>商品价格 </td>
<td>商品描述 </td>
<td>操作</td>
</tr>

<c:forEach items="${itemsList}" var="item">
<c:out value="${item }"></c:out>
<tr>
<th>${item.name }</th>
<th>${item.price }</th>
<th>${item.details }</th>
<th> <a href="${pageContext.request.contextPath}/item/editItem.action?id=${item.id}">修改</a></th>
</tr>
</c:forEach>

</table>

</body>
</html>