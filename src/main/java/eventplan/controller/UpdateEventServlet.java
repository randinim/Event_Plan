package eventplan.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eventplan.model.Event;
import eventplan.model.UpdateEventInterface;
import eventplan.model.UpdateEventService;

@WebServlet("/UpdateEventServlet")
public class UpdateEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UpdateEventServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Event event = new Event();
		
		event.setEventType(request.getParameter("type"));
		event.setDate(request.getParameter("date"));
		event.setVenue(request.getParameter("venue"));
		event.setCaterer(request.getParameter("caterer"));
		event.setDeco(request.getParameter("deco"));
		event.setMusic(request.getParameter("music"));
		event.setContact(Integer.parseInt(request.getParameter("contact")));
		
		String id = request.getParameter("eventId");
		int eventId = Integer.parseInt(id);

		UpdateEventInterface updateEventService = new UpdateEventService();
		updateEventService.updateEvent(eventId, event.getEventType(), event.getDate(), event.getVenue(),
				event.getCaterer(), event.getDeco(), event.getMusic(), event.getContact());

		response.sendRedirect("DisplayEvent.jsp");
		
		doGet(request, response);
	}

}
