package com.proyecti.twincoders.twinpush.dto.request.createDevice;

import org.apache.commons.lang3.StringUtils;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;

public final class CreateDeviceRequestDTO extends AbstractTwinpushRequestDTO {

	private String udid;
	private String alias_device;
	private String token;
	private String regid;
	private String pin;

	public String getUdid() {
		return udid;
	}

	public void setUdid(String udid) {
		this.udid = udid;
	}

	public String getAlias_device() {
		return alias_device;
	}

	public void setAlias_device(String alias_device) {
		this.alias_device = alias_device;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRegid() {
		return regid;
	}

	public void setRegid(String regid) {
		this.regid = regid;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		
		final StringBuilder sb = new StringBuilder("[udid=" + udid + ", alias_device=" + alias_device + ", ");
		
		if(!StringUtils.isEmpty(token))
		{
			sb.append("token = " + token + "]");
		}

		if(!StringUtils.isEmpty(pin))
		{
			sb.append("pin = " + pin + "]");
		}

		if(!StringUtils.isEmpty(regid))
		{
			sb.append("regid = " + regid + "]");
		}

		return sb.toString();
	}

	
}
