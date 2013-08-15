package com.proyecti.twincoders.twinpush.operations;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import com.proyecti.twincoders.twinpush.constants.PushConstants;
import com.proyecti.twincoders.twinpush.datasource.TwinPushConnectionService;
import com.proyecti.twincoders.twinpush.datasource.TwinPushConnectionServiceImpl;

public abstract class AbstractTwinPushOperations 
{
	protected TwinPushConnectionService twinPushConnectionService;

	protected String token;

	public AbstractTwinPushOperations(String token) 
	{
		this.twinPushConnectionService = new TwinPushConnectionServiceImpl();
		this.token = token;
	}

	protected HttpHeaders buildHeaders() 
	{
		final HttpHeaders httpHeaders = new HttpHeaders();
		
		httpHeaders.add(PushConstants.TWINPUSH_API_TOKEN_KEY, token);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);

		return httpHeaders;
	}

}
