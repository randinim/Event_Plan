<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.Connection,java.sql.Statement,java.sql.ResultSet,java.sql.SQLException,eventplan.util.DatabaseManager"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Events</title>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/table-data.css">
</head>
<body>
	<h1 style="text-align: center; color: rgb(255, 255, 255);">My Events</h1>

	<table>
		<tr>
			<th>Event Name</th>
			<th>Event Date</th>
			<th>Venue</th>
			<th>Caterer</th>
			<th>Decoration</th>
			<th>Music</th>
			<th>Contact</th>
			<th></th>
			<th></th>
		</tr>
		
		<%
		//caliberating intial properties
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            try {
                connection = DatabaseManager.getConnection();
                statement = connection.createStatement();
                String sql = "SELECT * FROM create_event";
                resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                	
        %>
		<tr>
			<td><%=resultSet.getString("eventType")%></td>
			<td><%=resultSet.getString("date")%></td>
			<td><%=resultSet.getString("venue")%></td>
			<td><%=resultSet.getString("caterer")%></td>
			<td><%=resultSet.getString("deco")%></td>
			<td><%=resultSet.getString("music")%></td>
			<td><%=resultSet.getString("contact")%></td>
			<td>
			    <form id="updateForm" action="UpdateEvent.jsp" method="post">
			        <input type="hidden" name="id" id="eventId" value="<%=resultSet.getInt("eventId")%>">
			        <input type="hidden" name="contact" id="contact" value="<%=resultSet.getInt("contact")%>">
			        <input type="hidden" name="date" id="date" value="<%=resultSet.getString("date")%>">
			        <button type="submit">Update</button>
			    </form>
			
			    <script>
			        document.getElementById("updateForm").addEventListener("submit", function (event) {
			            // No need to prevent the default form submission here, let the form submit as normal.
			            const formAction = this.action;
			            const eventId = document.getElementById("eventId").value;
			            const contact = document.getElementById("contact").value;
			            const date = document.getElementById("date").value;
			            const redirectUrl = `${formAction}?id=${eventId}&contact=${contact}&date=${date}`;
			            // You can also use location.replace for the redirect to prevent adding an entry in the browser history.
			            location.replace(redirectUrl);
			        });
			    </script>
			</td>

			<td>
				<form method="get" action="DeleteEventServlet">
                    <input type="hidden" name="id" value="<%= resultSet.getInt("eventId") %>">
                    <button type="submit">Delete</button>
                </form>
			</td>

		</tr>
		<%
		}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		    resultSet.close();
			statement.close();
		}
		%>
	</table>

</body>
</html>