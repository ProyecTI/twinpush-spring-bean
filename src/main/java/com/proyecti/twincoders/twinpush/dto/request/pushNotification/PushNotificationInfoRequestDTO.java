package com.proyecti.twincoders.twinpush.dto.request.pushNotification;

import com.proyecti.twincoders.twinpush.dto.request.common.CustomPropertiesRequestDTO;

public final class PushNotificationInfoRequestDTO {

	/**
	 * Name of the file you should have as a resource in your application, and
	 * it's the one that will be played when a notification is received
	 */
	private String sound;

	/**
	 * The text it will be shown in the notification. It should be as
	 * descriptive as possible.
	 */
	private String alert;

	/**
	 * The number you see in the icon of your app when you have unread
	 * notifications.
	 */
	private String badge;

	/**
	 * The time when you want to send the push. The format of this datetime is
	 * yyyy-mm-dd hh:mm:ss Z. If this parameter is not present, the notification
	 * will be send right now.
	 */
	//private String send_since;

	private CustomPropertiesRequestDTO custom_properties;

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

	public CustomPropertiesRequestDTO getCustom_properties() {
		return custom_properties;
	}

	public void setCustom_properties(
			CustomPropertiesRequestDTO custom_properties) {
		this.custom_properties = custom_properties;
	}

}
