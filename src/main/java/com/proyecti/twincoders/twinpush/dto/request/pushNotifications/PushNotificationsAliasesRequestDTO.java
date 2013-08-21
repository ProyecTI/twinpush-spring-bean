package com.proyecti.twincoders.twinpush.dto.request.pushNotifications;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class PushNotificationsAliasesRequestDTO extends AbstractTwinpushRequestDTO 
{

	private String alert;
	private String[] devices_aliases;

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public String[] getDevices_aliases() {
		return devices_aliases;
	}

	public void setDevices_aliases(String[] devices_aliases) {
		this.devices_aliases = devices_aliases;
	}

}
