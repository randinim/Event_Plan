package eventplan.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eventplan.model.DeleteEventInterface;
import eventplan.model.DeleteEventService;

@WebServlet("/DeleteEventServlet")
public class DeleteEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteEventServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Get the event ID to delete from the request parameter
		String eventId = request.getParameter("id");
		
		DeleteEventInterface deleteEvent = new DeleteEventService();
		deleteEvent.deleteEvent(Integer.parseInt(eventId));
		response.sendRedirect("DisplayEvent.jsp");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
