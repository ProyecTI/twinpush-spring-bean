package com.proyecti.twincoders.twinpush.dto.request.pushNotification;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class PushNotificationRequestDTO extends AbstractTwinpushRequestDTO 
{

	private PushNotificationInfoRequestDTO notification;
	private String[] tags;

	
	public PushNotificationInfoRequestDTO getNotification() {
		return notification;
	}

	public void setNotification(PushNotificationInfoRequestDTO notification) {
		this.notification = notification;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

}
