package com.proyecti.twincoders.twinpush.dto.response.pushNotifications;

public final class PushNotificationsReferencesResponseDTO {

	private int id;
	private String created_at;
	private String updated_at;
	private String device_id;
	private String notification_id;
	private String sent_at;
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getDevice_id() {
		return device_id;
	}

	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}

	public String getNotification_id() {
		return notification_id;
	}

	public void setNotification_id(String notification_id) {
		this.notification_id = notification_id;
	}

	public String getSent_at() {
		return sent_at;
	}

	public void setSent_at(String sent_at) {
		this.sent_at = sent_at;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
