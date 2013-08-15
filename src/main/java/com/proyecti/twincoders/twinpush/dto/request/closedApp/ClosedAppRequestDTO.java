package com.proyecti.twincoders.twinpush.dto.request.closedApp;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class ClosedAppRequestDTO extends AbstractTwinpushRequestDTO {

	private int id;
	private long closed_at;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getClosed_at() {
		return closed_at;
	}

	public void setClosed_at(long closed_at) {
		this.closed_at = closed_at;
	}

}
