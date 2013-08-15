package com.proyecti.twincoders.twinpush.dto.request.pushNotifications;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class PushNotificationsAliasesRequestDTO extends AbstractTwinpushRequestDTO {

	private String[] devices_aliases;

	public String[] getDevices_aliases() {
		return devices_aliases;
	}

	public void setDevices_aliases(String[] devices_aliases) {
		this.devices_aliases = devices_aliases;
	}

}
