package com.proyecti.twincoders.twinpush.dto.response.pushNotifications;

import java.util.Arrays;

import com.proyecti.twincoders.twinpush.dto.response.AbstractTwinpushResponseDTO;

public final class PushNotificationsResponseDTO extends AbstractTwinpushResponseDTO
{
	private PushNotificationsObjectsResponseDTO[] objects;
	private PushNotificationsReferencesResponseDTO[] references;

	public PushNotificationsObjectsResponseDTO[] getObjects() {
		return objects;
	}

	public void setObjects(PushNotificationsObjectsResponseDTO[] objects) {
		this.objects = objects;
	}

	public PushNotificationsReferencesResponseDTO[] getReferences() {
		return references;
	}

	public void setReferences(PushNotificationsReferencesResponseDTO[] references) {
		this.references = references;
	}

	@Override
	public String toString() {
		return "[objects="
				+ Arrays.toString(objects) + ", references="
				+ Arrays.toString(references) + "]";
	}

}
