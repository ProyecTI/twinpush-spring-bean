package com.proyecti.twincoders.twinpush.dto.response.pushNotifications;

public final class PushNotificationsObjectsResponseDTO {
	private String id;
	private String sound;
	private String alert;
	private String title;
	private String badge;
	private String tp_rich_url;
	private String send_since;
	private CustomPropertiesResponseDTO custom_properties;
	private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBadge() {
		return badge;
	}

	public void setBadge(String badge) {
		this.badge = badge;
	}

	public String getTp_rich_url() {
		return tp_rich_url;
	}

	public void setTp_rich_url(String tp_rich_url) {
		this.tp_rich_url = tp_rich_url;
	}

	public String getSend_since() {
		return send_since;
	}

	public void setSend_since(String send_since) {
		this.send_since = send_since;
	}

	public CustomPropertiesResponseDTO getCustom_properties() {
		return custom_properties;
	}

	public void setCustom_properties(
			CustomPropertiesResponseDTO custom_properties) {
		this.custom_properties = custom_properties;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
