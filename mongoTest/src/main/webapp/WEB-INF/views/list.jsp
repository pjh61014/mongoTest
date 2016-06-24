<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*,spring.data.mongodb.dto.*"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% List<ScoreDTO> mongolist  =
			(List<ScoreDTO>)request.getAttribute("mongolist"); 
	   int size = mongolist.size();	%>
	<h1>Score(Mongo)</h1>
	
	<hr/>
	<table align="center" border="1" width="600">
		<tr bgcolor="skyblue">
			<th>아이디</th><th>보너스</th><th>성명</th>
			<th>주소</th><th>부서번호</th>
			<th>삭제</th>
		</tr>
		<%for(int i = 0;i<size;i++){
			ScoreDTO user = mongolist.get(i);%>
			<tr>
				<td><a href="/mongodb/score/detail?key=id&value=<%=user.getId()%>&action=read"><%= user.getId() %></a></td>
				<td><%= user.getBonus()%></td>
				<td><%= user.getName() %></td>
				<td><%= user.getAddr() %></td>
				<td><%= user.getDept()%></td>
				<td>
		<a href="mybatisDel.do?id=<%=user.getId() %>">삭제</a></td>
			</tr>
			
		<%} %>
		<tr>
			<td colspan="6"><a href="/mongodb/score/list?pageNo=1">1</a>
			<a href="/mongodb/score/list?pageNo=2">2</a>
			<a href="/mongodb/score/list?pageNo=3">3</a>
			</td>
		</tr>
		
		
	</table>
	
</body>
</html>










