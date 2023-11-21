package eventplan.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eventplan.model.CreateEventInterface;
import eventplan.model.CreateEventService;
import eventplan.model.Event;

@WebServlet("/EventServlet")
//inheritance
public class CreateEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CreateEventServlet() {
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

		CreateEventInterface eventService = new CreateEventService();
		eventService.saveEvent(event.getEventType(), event.getDate(), event.getVenue(), event.getCaterer(),
				event.getDeco(), event.getMusic(), event.getContact());

		RequestDispatcher dispatcher = request.getRequestDispatcher("./DisplayEvent.jsp");
		dispatcher.forward(request, response);

		doGet(request, response);
	}

}
