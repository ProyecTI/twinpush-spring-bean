package com.proyecti.twincoders.twinpush.dto.response.destroyDevice;

import com.proyecti.twincoders.twinpush.dto.response.AbstractTwinpushResponseDTO;

public final class DestroyDeviceResponseDTO extends AbstractTwinpushResponseDTO {

	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
