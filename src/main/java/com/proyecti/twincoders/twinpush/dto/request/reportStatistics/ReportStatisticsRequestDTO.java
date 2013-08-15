package com.proyecti.twincoders.twinpush.dto.request.reportStatistics;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class ReportStatisticsRequestDTO extends
		AbstractTwinpushRequestDTO {

	private int id;
	private ReportStatisticsDeviceRequestDTO device;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ReportStatisticsDeviceRequestDTO getDevice() {
		return device;
	}

	public void setDevice(ReportStatisticsDeviceRequestDTO device) {
		this.device = device;
	}

}
