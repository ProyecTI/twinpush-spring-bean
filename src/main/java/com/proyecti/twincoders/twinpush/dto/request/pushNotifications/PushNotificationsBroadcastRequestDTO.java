package com.proyecti.twincoders.twinpush.dto.request.pushNotifications;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;


public final class PushNotificationsBroadcastRequestDTO extends AbstractTwinpushRequestDTO 
{

	private NotificationsRequestDTO notification;
	private boolean broadcast;

	public PushNotificationsBroadcastRequestDTO()
	{
		this.notification = new NotificationsRequestDTO();
		this.broadcast = true;
	}
	
	public NotificationsRequestDTO getNotification() {
		return notification;
	}

	public void setNotification(NotificationsRequestDTO notification) {
		this.notification = notification;
	}

	public boolean isBroadcast() {
		return broadcast;
	}

	@Override
	public String toString() {
		return "[sound=" + notification.getSound() + ", alert="
				+ notification.getAlert() + ", badge=" + notification.getBadge() + ", send_since=" + notification.getSend_since()
				+ ", broadcast=true]";
	}
	
}
