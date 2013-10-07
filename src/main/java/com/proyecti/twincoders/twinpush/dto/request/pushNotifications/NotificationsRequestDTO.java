package com.proyecti.twincoders.twinpush.dto.request.pushNotifications;


public final class NotificationsRequestDTO 
{
	private String sound;
	private String alert;
	private String badge;
	private String send_since;

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

	public String getSend_since() {
		return send_since;
	}

	public void setSend_since(String send_since) {
		this.send_since = send_since;
	}
	
}
