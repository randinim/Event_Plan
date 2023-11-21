package eventplan.model;

public interface UpdateEventInterface {
	void updateEvent(int eventId, String eventType, String date, String venue, String caterer, String deco, String music, int contact);

}
