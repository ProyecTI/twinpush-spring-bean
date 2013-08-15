package com.proyecti.twincoders.twinpush.dto.response.searchNotification;

import com.proyecti.twincoders.twinpush.dto.response.AbstractTwinpushResponseDTO;

public final class SearchNotificationsResponseDTO extends AbstractTwinpushResponseDTO 
{
	private SearchNotificationsObjectsResponseDTO[] objects;
	private SearchNotificationsReferencesResponseDTO[] references;

	public SearchNotificationsObjectsResponseDTO[] getObjects() {
		return objects;
	}

	public void setObjects(SearchNotificationsObjectsResponseDTO[] objects) {
		this.objects = objects;
	}

	public SearchNotificationsReferencesResponseDTO[] getReferences() {
		return references;
	}

	public void setReferences(SearchNotificationsReferencesResponseDTO[] references) {
		this.references = references;
	}

}
