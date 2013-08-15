package com.proyecti.twincoders.twinpush.dto.request.reportStatistics;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class ReportStatisticsDeviceRequestDTO extends AbstractTwinpushRequestDTO {

	private float screen_size;
	private float latitude;
	private float longitude;

	public float getScreen_size() {
		return screen_size;
	}

	public void setScreen_size(float screen_size) {
		this.screen_size = screen_size;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

}
