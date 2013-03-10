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
    亲密朋友：
    <c:if test="${intimacyFriendList!=null}">
        <c:forEach var="intimacyFriend" items="${intimacyFriendList}">
            <p style="display: inline-block;"><a href="" target="_blank"><img alt="" style="" src="${intimacyFriend.profileImageUrl}"></a>
            </p>
            <p><c:out value="${intimacyFriend.screenName}"/></p>
        </c:forEach>
    </c:if>
</div>

<div id="way2" style="">
    半熟朋友：
    <c:if test="${halfIntimacyFriendList!=null}">
        <c:forEach var="halfIntimacyFriend" items="${halfIntimacyFriendList}">
            <p style="display: inline-block;"><a href="" target="_blank"><img alt="" style=""  src="${halfIntimacyFriend.profileImageUrl}"></a>
            </p>
            <p><c:out value="${halfIntimacyFriend.screenName}"/></p>
        </c:forEach>
    </c:if>
</div>

</body>

</html>