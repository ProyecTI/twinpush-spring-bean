package com.proyecti.twincoders.twinpush.dto.request.updateBadge;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class UpdateBadgeRequestDTO extends AbstractTwinpushRequestDTO {

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
