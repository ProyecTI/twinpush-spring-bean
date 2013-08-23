package com.proyecti.twincoders.twinpush.dto.response.createDevice;

import java.util.Arrays;

import com.proyecti.twincoders.twinpush.dto.response.AbstractTwinpushResponseDTO;

public final class CreateDeviceResponseDTO extends AbstractTwinpushResponseDTO {

	private CreateDeviceObjectsResponseDTO[] objects;
	private CreateDeviceReferencesResponseDTO[] references;

	public CreateDeviceObjectsResponseDTO[] getObjects() {
		return objects;
	}

	public void setObjects(CreateDeviceObjectsResponseDTO[] objects) {
		this.objects = objects;
	}

	public CreateDeviceReferencesResponseDTO[] getReferences() {
		return references;
	}

	public void setReferences(CreateDeviceReferencesResponseDTO[] references) {
		this.references = references;
	}

	@Override
	public String toString() {
		return "[objects=" + Arrays.toString(objects)
				+ ", references=" + Arrays.toString(references) + "]";
	}

}
