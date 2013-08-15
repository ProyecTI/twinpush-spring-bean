package com.proyecti.twincoders.twinpush.dto.response.searchNotification;

public final class SearchNotificationsObjectsResponseDTO {

	private int id;
	private String sound;
	private String alert;
	private String badge;
	private String[] tags;
	private String last_sent_at;
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public String getBadge() {
		return badge;
	}

	public void setBadge(String badge) {
		this.badge = badge;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public String getLast_sent_at() {
		return last_sent_at;
	}

	public void setLast_sent_at(String last_sent_at) {
		this.last_sent_at = last_sent_at;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
