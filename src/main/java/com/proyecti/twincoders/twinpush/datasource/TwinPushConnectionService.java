package com.proyecti.twincoders.twinpush.datasource;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;
import com.proyecti.twincoders.twinpush.dto.response.AbstractTwinpushResponseDTO;

public interface TwinPushConnectionService
{
	ResponseEntity<? extends AbstractTwinpushResponseDTO> sendRequestToTwinpush(
			final HttpMethod httpMethod, 
			final String url,
			final Map<String, String> uriVariablesMap,
			final HttpEntity<? extends AbstractTwinpushRequestDTO> httpEntity, 
			final Class<? extends AbstractTwinpushResponseDTO> responseClass);
}
