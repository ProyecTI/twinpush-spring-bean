package com.proyecti.twincoders.twinpush.dto.response.createDevice;

public final class CreateDeviceReferencesResponseDTO {

	private int id;
	private String name;
	private int mode;
	private String icon_file_name;
	private String created_at;
	private String updated_at;
	private int user_id;
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public String getIcon_file_name() {
		return icon_file_name;
	}

	public void setIcon_file_name(String icon_file_name) {
		this.icon_file_name = icon_file_name;
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

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
