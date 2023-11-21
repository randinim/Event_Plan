package eventplan.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import eventplan.util.DatabaseManager;

public class CreateEventService implements CreateEventInterface{

	@Override
	public void saveEvent(String eventType, String date, String venue, String caterer,
			String deco, String music, int contact) {


		Connection connection = null; // initiate
		PreparedStatement preparedStatement = null;

		try {
			connection = DatabaseManager.getConnection();

			String eventSql = "INSERT INTO create_event(eventType,date,venue,caterer,deco,music,contact)VALUES('" + eventType + "', '" + date + "', '" + venue + "', '" + caterer + "', '" + deco + "', '" + music + "', '" + contact + "')";

			preparedStatement = connection.prepareStatement(eventSql); // initiate resultset

			int status = preparedStatement.executeUpdate();

			if (status == 1) {
				System.out.println("success");
			} else {
				System.out.println("failed");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	
		
	}

	
	
}
