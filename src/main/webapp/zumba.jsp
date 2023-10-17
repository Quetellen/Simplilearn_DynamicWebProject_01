<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Batch"%>
<%@ page import="java.util.ArrayList"%>
<%
ArrayList<Batch> list = (ArrayList<Batch>) request.getAttribute("batch");
//for (int i = 0; i < list.size(); i++){
//out.println(list.get(i).getB_id());
//out.println(list.get(i).getName());
//out.println(list.get(i).getStartTime());
//out.println(list.get(i).getEndTime());
//out.println(list.get(i).getShift());
//}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zumba</title>
<link rel="icon" href="pictures/faviconzumba.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Zumba Batch</h1>
	<a href="newBatch.html" class="button">Insert New Batch</a>
	<table id="table">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Start Time</th>
				<th>End Time</th>
				<th>Shift</th>
				<th>Options</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < list.size(); i++) {
			%>
			<tr>
				<td><%=list.get(i).getB_id()%></td>
				<td><%=list.get(i).getName()%></td>
				<td><%=list.get(i).getStartTime()%></td>
				<td><%=list.get(i).getEndTime()%></td>
				<td><%=list.get(i).getShift()%></td>
				<td><a href="select?b_id=<%= list.get(i).getB_id()%>" class="button1"> Edit</a></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>

</body>
</html>