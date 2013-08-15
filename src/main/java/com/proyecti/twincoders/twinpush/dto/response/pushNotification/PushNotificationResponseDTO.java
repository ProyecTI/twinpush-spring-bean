package com.proyecti.twincoders.twinpush.dto.response.pushNotification;

import com.proyecti.twincoders.twinpush.dto.response.AbstractTwinpushResponseDTO;

public final class PushNotificationResponseDTO extends AbstractTwinpushResponseDTO {

	private PushNotificationObjectsResponseDTO[] objects;
	private PushNotificationReferencesResponseDTO[] references;

	public PushNotificationObjectsResponseDTO[] getObjects() {
		return objects;
	}

	public void setObjects(PushNotificationObjectsResponseDTO[] objects) {
		this.objects = objects;
	}

	public PushNotificationReferencesResponseDTO[] getReferences() {
		return references;
	}

	public void setReferences(PushNotificationReferencesResponseDTO[] references) {
		this.references = references;
	}

}
