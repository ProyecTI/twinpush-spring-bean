package com.proyecti.twincoders.twinpush.dto.request.pushNotifications;

import java.util.Arrays;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class PushNotificationsIdsRequestDTO extends AbstractTwinpushRequestDTO 
{
	private NotificationsRequestDTO notification;
	private String[] devices_ids;

	public PushNotificationsIdsRequestDTO()
	{
		this.notification = new NotificationsRequestDTO();
	}
	
	public String[] getDevices_ids() {
		return devices_ids;
	}

	public void setDevices_ids(String[] devices_ids) {
		this.devices_ids = devices_ids;
	}

	public NotificationsRequestDTO getNotification() {
		return notification;
	}

	public void setNotification(NotificationsRequestDTO notification) {
		this.notification = notification;
	}

	@Override
	public String toString() {
		return "[sound=" + notification.getSound() + ", alert="
				+ notification.getAlert() + ", badge=" + notification.getBadge() + ", send_since=" + notification.getSend_since()
				+ ", devices_ids=" + Arrays.toString(devices_ids) + "]";
	}


}