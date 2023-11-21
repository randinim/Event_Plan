package eventplan.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import eventplan.util.DatabaseManager;

public class DeleteEventService implements DeleteEventInterface{

	@Override
	public void deleteEvent(int eventId) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = DatabaseManager.getConnection();

			String deleteEventSql = "DELETE FROM create_event WHERE eventId='" + eventId + "'";
			preparedStatement = connection.prepareStatement(deleteEventSql);
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
