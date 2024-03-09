<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  MemberRepository memberRepository= MemberRepository.getInstance();
  //request response로t 사용가능
  System.out.println();
  String username = request.getParameter("username");
  int age = Integer.parseInt(request.getParameter("age"));
  Member member = new Member(username,age);
  System.out.println(member);
  memberRepository.save(member);


%>


<html>
<head>
    <title>Title</title>
</head>
