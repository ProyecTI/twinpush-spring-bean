package com.proyecti.twincoders.twinpush.dto.request.openedApp;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class OpenedAppRequestDTO extends AbstractTwinpushRequestDTO {

	private int id;
	private long open_at;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getOpen_at() {
		return open_at;
	}

	public void setOpen_at(long open_at) {
		this.open_at = open_at;
	}

}
