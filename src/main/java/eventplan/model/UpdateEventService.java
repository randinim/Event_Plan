package eventplan.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import eventplan.util.DatabaseManager;

public class UpdateEventService implements UpdateEventInterface{

	@Override
	public void updateEvent(int eventId, String eventType, String date, String venue,
			String caterer, String deco, String music, int contact) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = DatabaseManager.getConnection();

			String deleteEventSql = "UPDATE create_event SET eventType = '"+eventType+"',date='"+date+"',venue='"+venue+"',caterer='"+caterer+"',deco='"+deco+"', music='"+music+"', contact='"+contact+"'  WHERE eventId='" + eventId + "'";
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
