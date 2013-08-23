package com.proyecti.twincoders.twinpush.dto.request.pushNotifications;

import java.util.Arrays;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class PushNotificationsIdsRequestDTO extends AbstractTwinpushRequestDTO 
{
	private String sound;
	private String alert;
	private String badge;
	private String send_since;
	private String[] devices_ids;

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

	public String[] getDevices_ids() {
		return devices_ids;
	}

	public void setDevices_ids(String[] devices_ids) {
		this.devices_ids = devices_ids;
	}

	@Override
	public String toString() {
		return "[sound=" + sound + ", alert="
				+ alert + ", badge=" + badge + ", send_since=" + send_since
				+ ", devices_ids=" + Arrays.toString(devices_ids) + "]";
	}

}
