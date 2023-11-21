<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Create Event</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/create-event.css">


</head>

	<body>
    <div class="container">
        <h2>Create New Event</h2>
        <form action="EventServlet" method="post">
            <div class="form-group">
                <label for="type">Event Type</label> 
                <select name="type" id="type"  style="width: 100%;">
					<option value="Birthday Party">Birthday Party</option>
					<option value="Wedding">Wedding</option>
					<option value="Anniversary Celebration">Anniversary Celebration</option>
					<option value="Engagement">Engagement</option>
				</select>
			</div>
			<div class="form-group">
                <label for="date">Date</label> 
                <input type="date" name="date" id="date" required="required" style="width: 100%;"/>
			</div>
            <div class="form-group">
                <label for="venue">Venue</label> 
                <select name="venue" id="venue"  style="width: 100%;">
					<option value="Malabe">Malabe</option>
					<option value="Kandy">Kandy</option>
					<option value="Colombo">Colombo</option>
					<option value="Kegalle">Kegalle</option>
					<option value="Galle">Galle</option>
				</select>
			</div>
            <div class="form-group">
                <label for="caterer">Caterer Service</label>
                <select name="caterer" id="caterer"  style="width: 100%;">
					<option value="Avanya">Avanya</option>
					<option value="Fresh Way">Fresh Way</option>
					<option value="Bhupathi Villa">Bhupathi Villa</option>
				</select>
            </div>
            <div class="form-group">
                <label for="deco">Decorations</label> 
                <select name="deco" id="deco"  style="width: 100%;">
					<option value="Fresh Flowers">Fresh Flowers</option>
					<option value="Artificial Flowers">Artificial Flowers</option>
					<option value="Other Theme">Other Theme</option>
				</select>
			</div>
            <div class="form-group">
                <label for="music">Music Band</label> 
                <select name="music" id="music" style="width: 100%;">
					<option value="DJ Chami">DJ Chami</option>
					<option value="Band Rythem">Band Rythem</option>
					<option value="Vayo">Vayo</option>
				</select>
			</div>
			<div class="form-group">
                <label for="contact">Contact Number</label> 
                <input type="tel" required="required" minlength="10" maxlength="10" placeholder="Ex: 07XXXXXXXX" name="contact" id="contact" style="width: 95%;"/>
			</div>
            <button type="submit">Create Event</button>
        </form>
    </div>
</body>
	
</html>