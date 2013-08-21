package com.proyecti.twincoders.twinpush.datasource;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.proyecti.twincoders.twinpush.constants.PushConstants;
import com.proyecti.twincoders.twinpush.dto.request.AbstractTwinpushRequestDTO;
import com.proyecti.twincoders.twinpush.dto.response.AbstractTwinpushResponseDTO;

@Service("v1.twinpush.service")
public final class TwinPushConnectionServiceImpl implements TwinPushConnectionService
{
	private RestTemplate restTemplate;
	
	public TwinPushConnectionServiceImpl()
	{
		this.restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
	}
	
	public ResponseEntity<? extends AbstractTwinpushResponseDTO> sendRequestToTwinpush(
			final HttpMethod httpMethod, 
			final String url,
			final Map<String, String> uriVariablesMap,
			final HttpEntity<? extends AbstractTwinpushRequestDTO> requestEntity, 
			final Class<? extends AbstractTwinpushResponseDTO> responseClass)
	{
		boolean pendingToBeSend = true;
		ResponseEntity<? extends AbstractTwinpushResponseDTO> httpResponse = null;
		
		for(int i = 0; i < PushConstants.MAX_NUMBER_OF_RETRIES && pendingToBeSend; i++) 
		{
			httpResponse =  restTemplate.exchange(url, httpMethod, requestEntity, responseClass, uriVariablesMap);
			
			if(HttpStatus.OK == httpResponse.getStatusCode())
			{
				break;
			}
		}

		return httpResponse;
	}

}
