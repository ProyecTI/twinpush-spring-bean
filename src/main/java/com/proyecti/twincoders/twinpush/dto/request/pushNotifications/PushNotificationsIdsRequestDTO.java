package com.proyecti.twincoders.twinpush.dto.request.pushNotifications;

public final class PushNotificationsIdsRequestDTO extends AbstractPushNotificationsRequestDTO {

	private int[] devices_ids;

	public int[] getDevices_ids() {
		return devices_ids;
	}

	public void setDevices_ids(int[] devices_ids) {
		this.devices_ids = devices_ids;
	}

}
