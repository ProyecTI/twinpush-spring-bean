package com.proyecti.twincoders.twinpush.dto.request.pushNotifications;

public final class PushNotificationsSegmentsRequestDTO extends AbstractPushNotificationsRequestDTO {

	private String[] segments;

	public String[] getSegments() {
		return segments;
	}

	public void setSegments(String[] segments) {
		this.segments = segments;
	}

}
