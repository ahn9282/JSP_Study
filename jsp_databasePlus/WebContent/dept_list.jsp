<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="edu.sejong.ex.vo.DeptVO"%>
<%@page import="java.util.List"%>
<%@page import="edu.sejong.ex.dao.DeptDao"%>
<%@page import="java.sql.*"%>
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
		DeptDao deptDao = new DeptDao();
    	
         List<DeptVO> dtos = deptDao.deptList();
         
         for(DeptVO vo : dtos){
        	 
     		out.print("부서번호 : " + vo.getDeptno() +
  				  " 직종이름 : " + vo.getDname() + 
  				  " 지역 : " + vo.getLoc() + "<br>");
        	 
         }
%>
</body>
</html>