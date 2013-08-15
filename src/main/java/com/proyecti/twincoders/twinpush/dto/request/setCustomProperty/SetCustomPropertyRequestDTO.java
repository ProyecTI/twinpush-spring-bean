package com.proyecti.twincoders.twinpush.dto.request.setCustomProperty;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class SetCustomPropertyRequestDTO extends AbstractTwinpushRequestDTO {

	private String name;
	private String type;
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
