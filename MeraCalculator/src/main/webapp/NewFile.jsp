<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mera calculator</title>

<style>
	
	img{
		height:200px;
		weight:200px;	
		margin-top: 20px;
	}
	
	body{
		text-align: center;
		background: linear-gradient(to right,#e66465, #9198e5);
	}
	
	h1{
		color:white;
		font-size:40px;
	}
	
	input,button{
		font-size:20px;
		color:white;
		border-radius: 5%;
		background-color: black;
		border:2px solid white;
	}
	
	img:hover{
		transform:scale(1.1);
		cursor: pointer;
	}
</style>
</head>
<body>
	<img src="images/laugh.gif">
	<h1>Joke of the Day!</h1>
	<h3>🤣<%= request.getParameter("joke") %> 👌</h3>
	
	<form action="MyServlet">
		<input name="num1" placeholder="First name">
		<input name="num2" placeholder="Second name">
		
		<button name="bt1" value="1">+</button>
		<button name="bt1" value="2">-</button>
		<button name="bt1" value="3">*</button>
		<button name="bt1" value="4">/</button>
	</form>
	
	<h1>Ans=<%= request.getParameter("ans") %> 🏴</h1>

</body>
</html>