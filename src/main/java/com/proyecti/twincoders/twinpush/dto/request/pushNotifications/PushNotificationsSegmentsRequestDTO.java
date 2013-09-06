package com.proyecti.twincoders.twinpush.dto.request.pushNotifications;

import java.util.Arrays;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class PushNotificationsSegmentsRequestDTO extends AbstractTwinpushRequestDTO {

	private NotificationsRequestDTO notification;
	private String[] segments;

	public PushNotificationsSegmentsRequestDTO()
	{
		this.notification = new NotificationsRequestDTO();
	}
	
	public NotificationsRequestDTO getNotification() {
		return notification;
	}

	public void setNotification(NotificationsRequestDTO notification) {
		this.notification = notification;
	}

	public String[] getSegments() {
		return segments;
	}

	public void setSegments(String[] segments) {
		this.segments = segments;
	}


	@Override
	public String toString() {
		return "[sound=" + notification.getSound() + ", alert="
				+ notification.getAlert() + ", badge=" + notification.getBadge() + ", send_since=" + notification.getSend_since()
				+ ", segments=" + Arrays.toString(segments) + "]";
	}
	
}
