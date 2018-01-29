<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.mycomp{
width: 100%;
background: black;
margin-top: 10px;
margin-bottom: 20px;
color: white;
font-family: 'Georgia';
font-size: 20px;
padding: 10px;
border: 1px solid white;
border-radius: 10px;
transition:2s ease-in-out
}

.mycomp:hover{
background: black;
color: white;
border: 1px solid black;
border-radius: 1px;
}
.mybtn{
background: black;
margin: 0 auto;
font-weight: bold;
margin-top: 10px;
margin-bottom: 20px;
color: white;
font-family: 'Georgia';
font-size: 20px;
padding: 10px;
border: 1px solid white;
border-radius: 20px;
transition:2s ease-in-out
}

</style>

</head>
<body>
<form action="FeedbackServlet" method="post">
<div style="width: 400px;margin: 0 auto;">
<input type="number" name="roll" id="" class="mycomp" placeholder="Enter rollno">
<br>
<input type="text" name="stuname" id="stuname"class="mycomp" placeholder="Student name">
<br>
<select name="branch" id="branch" class="mycomp">
<option>CBA</option>
<option>BDA</option>
<option>MA</option>
</select>
<br>
<select  name="category" id="cat" class="mycomp">
<option>Suggestions</option>
<option>Complaints</option>
<option>Reviews</option>
<option>Examination</option>
<option>Registration</option>
<option>Others</option>
</select>
<br>
<textarea  name="message" class="mycomp" placeholder="Enter message"></textarea>
<br>
<input type="submit"  class="mybtn" value="Submit Feedback">
<br>
</div>
</form>

<script>
<%
String msg=request.getParameter("msg");
try
{
	if(msg.equals("insert successful"))
	{
		out.println("alert(record inserted successfully)");
	}
	else if(msg.equals("insert failed"))
	{
		out.println("alert(record not inserted successfully)");
	}
}
catch(Exception e)
{
}
%>
</script>
</body>
</html>