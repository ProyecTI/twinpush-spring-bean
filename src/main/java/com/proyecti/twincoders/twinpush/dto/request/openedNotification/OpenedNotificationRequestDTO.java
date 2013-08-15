package com.proyecti.twincoders.twinpush.dto.request.openedNotification;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class OpenedNotificationRequestDTO extends AbstractTwinpushRequestDTO {

	private String device_id;
	private String notification_id;
	private String open_at;

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

	public String getOpen_at() {
		return open_at;
	}

	public void setOpen_at(String open_at) {
		this.open_at = open_at;
	}

}
