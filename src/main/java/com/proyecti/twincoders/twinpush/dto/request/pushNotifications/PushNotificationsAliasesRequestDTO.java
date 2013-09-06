package com.proyecti.twincoders.twinpush.dto.request.pushNotifications;

import java.util.Arrays;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class PushNotificationsAliasesRequestDTO extends AbstractTwinpushRequestDTO 
{
	private NotificationsRequestDTO notification;
	private String[] devices_aliases;

	public PushNotificationsAliasesRequestDTO()
	{
		this.notification = new NotificationsRequestDTO();
	}
	
	public String[] getDevices_aliases() {
		return devices_aliases;
	}

	public void setDevices_aliases(String[] devices_aliases) {
		this.devices_aliases = devices_aliases;
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
				+ ", devices_aliases=" + Arrays.toString(devices_aliases) + "]";
	}

}
