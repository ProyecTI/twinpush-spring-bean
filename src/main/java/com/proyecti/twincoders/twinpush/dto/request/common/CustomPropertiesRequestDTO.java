package com.proyecti.twincoders.twinpush.dto.request.common;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class CustomPropertiesRequestDTO extends AbstractTwinpushRequestDTO {

	/**
	 * Behaviour of the app when a notification is received (optional)
	 * Just like a rich push notification, in order to get a certain behaviour when a notification 
	 * is received, you can add a custom property with the key callback. 
	 * 
	 * Once the app is launched it should check the new notifications and the custom properties 
	 * in it to act accordingly.
	 */
	
	private String callback;
	
	/**
	 * Rich Notifications (optional)
	 * Notifications can have an URL associated to show it instead of plain text. 
	 * In order to send a rich notification you must add a custom property with the key rich_url.
	 */
	private String rich_url;
	
	
	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	public String getRich_url() {
		return rich_url;
	}

	public void setRich_url(String rich_url) {
		this.rich_url = rich_url;
	}

}
