package eventplan.model;

public interface CreateEventInterface {
	void saveEvent(String eventType, String date, String venue, String caterer, String deco, String music, int contact);

}
