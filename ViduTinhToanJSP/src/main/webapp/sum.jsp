<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String strA = request.getParameter("a");
	int valueA = Integer.parseInt( strA );
	
	String strB = request.getParameter("b");
	int valueB = Integer.parseInt( strB );
	
	out.print("Tổng của " + valueA + " và " + valueB + " là: " + (valueA + valueB) + "<br>");

	out.print("Hiệu của " + valueA + " và " + valueB + " là: " + (valueA - valueB) + "<br>");

	out.print("Tích của " + valueA + " và " + valueB + " là: " + (valueA * valueB) + "<br>");

	if (valueB != 0) {
	    out.print("Thương của " + valueA + " và " + valueB + " là: " + ((double)valueA / valueB) + "<br>");
	} else {
	    out.print("Thương của " + valueA + " và " + valueB + " là: Không thể chia cho 0<br>");
	}
%>
</body>
</html>