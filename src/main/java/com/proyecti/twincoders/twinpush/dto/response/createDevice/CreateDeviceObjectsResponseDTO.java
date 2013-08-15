package com.proyecti.twincoders.twinpush.dto.response.createDevice;

public final class CreateDeviceObjectsResponseDTO {

	private int id;
	private String token;
	private String alias_device;
	private String created_at;
	private String updated_at;
	private String last_registered_at;
	private int app_id;
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAlias_device() {
		return alias_device;
	}

	public void setAlias_device(String alias_device) {
		this.alias_device = alias_device;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getLast_registered_at() {
		return last_registered_at;
	}

	public void setLast_registered_at(String last_registered_at) {
		this.last_registered_at = last_registered_at;
	}

	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
