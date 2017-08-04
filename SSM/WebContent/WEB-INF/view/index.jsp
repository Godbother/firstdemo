<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../common/header.jspf"></jsp:include>
<title>首页</title>
</head>
<body>
	<table>
		<caption>用户列表</caption>
		<tr>
			<th>用户名</th>
			<th>密码</th>
			<th>地址</th>
		</tr>
		<c:forEach items="${user_list }" var="item">
			<tr>
				<th>${item.username }</th>
				<th>${item.ps }</th>
				<th>${item.ades }</th>
			</tr>
		</c:forEach>
	</table>
	<a href="${pageContext.request.contextPath }/user/finduserbyid.action?id=1">查询</a>
	<c:if test="${info }!=null">
		<div>${info.username }</div>
		<div>${info.ps }</div>
		<div>${info.ades }</div>
	</c:if>
<jsp:include page="../common/footer.jspf"></jsp:include>
