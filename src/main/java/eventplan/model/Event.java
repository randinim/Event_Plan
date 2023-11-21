package eventplan.model;

public class Event {
	private String eventType;
	private String date;
	private String venue;
	private String caterer;
	private String deco;
	private String music;
	private int contact;

	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getCaterer() {
		return caterer;
	}
	public void setCaterer(String caterer) {
		this.caterer = caterer;
	}
	public String getDeco() {
		return deco;
	}
	public void setDeco(String deco) {
		this.deco = deco;
	}
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	
}
