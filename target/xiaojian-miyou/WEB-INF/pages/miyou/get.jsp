<%--
  Created by IntelliJ IDEA.
  User: chenxiaojian
  Date: 13-3-9
  Time: 下午4:39
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>hello,miyou</title>
</head>
<body>
<div id="way" style="">
    <ul  id="ul" class="way_ul" style="">
    <c:if test="${intimacyFriendList!=null}">
    <c:forEach var="intimacyFriend" items="${intimacyFriendList}">
    <li style="">
        <a href="" target="_blank">
            <img alt="" style="" src="${intimacyFriend.profileImageUrl}">
            <p><c:out value="${intimacyFriend.screenName}"/></p></a>
    </c:forEach>
    </c:if>
    </ul>
</div>

</body>

</html>