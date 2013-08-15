package com.proyecti.twincoders.twinpush.dto.request.searchNotification;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class SearchNotificationsRequestDTO extends
		AbstractTwinpushRequestDTO {

	private String[] tags;
	private String[] no_tags;
	private String all;

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public String[] getNo_tags() {
		return no_tags;
	}

	public void setNo_tags(String[] no_tags) {
		this.no_tags = no_tags;
	}

	public String getAll() {
		return all;
	}

	public void setAll(String all) {
		this.all = all;
	}

}
