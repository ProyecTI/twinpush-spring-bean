package com.proyecti.twincoders.twinpush.dto.response.setCustomProperty;

import com.proyecti.twincoders.twinpush.dto.response.AbstractTwinpushResponseDTO;

public final class SetCustomPropertyResponseDTO extends AbstractTwinpushResponseDTO {

	private String id;
	private String badge;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBadge() {
		return badge;
	}

	public void setBadge(String badge) {
		this.badge = badge;
	}

}
