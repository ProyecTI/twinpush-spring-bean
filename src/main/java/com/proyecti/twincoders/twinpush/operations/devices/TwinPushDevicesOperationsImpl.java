package com.proyecti.twincoders.twinpush.operations.devices;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.proyecti.twincoders.twinpush.constants.PushConstants;
import com.proyecti.twincoders.twinpush.dto.request.createDevice.CreateDeviceRequestDTO;
import com.proyecti.twincoders.twinpush.dto.request.searchNotification.SearchNotificationsRequestDTO;
import com.proyecti.twincoders.twinpush.dto.request.setCustomProperty.SetCustomPropertyRequestDTO;
import com.proyecti.twincoders.twinpush.dto.request.updateBadge.UpdateBadgeRequestDTO;
import com.proyecti.twincoders.twinpush.dto.response.createDevice.CreateDeviceResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.deleteCustomProperties.ClearCustomPropertiesResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.destroyDevice.DestroyDeviceResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.searchNotification.SearchNotificationsResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.setCustomProperty.SetCustomPropertyResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.updateBadge.UpdateBadgeResponseDTO;
import com.proyecti.twincoders.twinpush.operations.AbstractTwinPushOperations;


public class TwinPushDevicesOperationsImpl extends AbstractTwinPushOperations implements TwinPushDevicesOperations 
{

	public TwinPushDevicesOperationsImpl(String token)
	{
		super(token);
	}
	
	@SuppressWarnings("unchecked")
	public ResponseEntity<CreateDeviceResponseDTO> createDevice(final Map<String,String> uriVariablesMap, final CreateDeviceRequestDTO createDeviceRequestDTO)
	{
		final HttpEntity<CreateDeviceRequestDTO> httpEntity = new HttpEntity<CreateDeviceRequestDTO>(createDeviceRequestDTO, buildHeaders());

		return (ResponseEntity<CreateDeviceResponseDTO>) 
					twinPushConnectionService.sendRequestToTwinpush(HttpMethod.POST,
											PushConstants.TWINPUSH_URL_CREATE_DEVICE,
											uriVariablesMap,
											httpEntity,
											CreateDeviceResponseDTO.class);
	}

	
	
	@SuppressWarnings("unchecked")
	public ResponseEntity<UpdateBadgeResponseDTO> updateBadge(final Map<String,String> uriVariablesMap, final UpdateBadgeRequestDTO updateBadgeRequestDTO) {

		final HttpEntity<UpdateBadgeRequestDTO> httpEntity = new HttpEntity<UpdateBadgeRequestDTO>(updateBadgeRequestDTO, buildHeaders());

		return (ResponseEntity<UpdateBadgeResponseDTO>) 
					twinPushConnectionService.sendRequestToTwinpush(HttpMethod.POST,
											PushConstants.TWINPUSH_URL_UPDATE_BADGE,
											uriVariablesMap,
											httpEntity,
											UpdateBadgeResponseDTO.class);
	}

	@SuppressWarnings("unchecked")
	public ResponseEntity<SearchNotificationsResponseDTO> searchNotificationByDevice(final Map<String,String> uriVariablesMap, final SearchNotificationsRequestDTO searchNotificationsRequestDTO) {

		final HttpEntity<SearchNotificationsRequestDTO> httpEntity = new HttpEntity<SearchNotificationsRequestDTO>(searchNotificationsRequestDTO, buildHeaders());

		return (ResponseEntity<SearchNotificationsResponseDTO>) 
					twinPushConnectionService.sendRequestToTwinpush(HttpMethod.POST,
											PushConstants.TWINPUSH_URL_SEARCH_NOTIFICATION, 
											uriVariablesMap,
											httpEntity,
											SearchNotificationsResponseDTO.class);
	}
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ResponseEntity<DestroyDeviceResponseDTO> destroyDevice(final Map<String,String> uriVariablesMap) {

		final HttpEntity httpEntity = new HttpEntity(buildHeaders());

		return (ResponseEntity<DestroyDeviceResponseDTO>) 
					twinPushConnectionService.sendRequestToTwinpush(HttpMethod.DELETE,
											PushConstants.TWINPUSH_URL_DESTROY_DEVICE,
											uriVariablesMap,
											httpEntity,
											DestroyDeviceResponseDTO.class);
	}



	@SuppressWarnings("unchecked")
	public ResponseEntity<SetCustomPropertyResponseDTO> setCustomProperty(final Map<String,String> uriVariablesMap, final SetCustomPropertyRequestDTO updateCustomPropertiesRequestDTO) {

		final HttpEntity<SetCustomPropertyRequestDTO> httpEntity = new HttpEntity<SetCustomPropertyRequestDTO>(updateCustomPropertiesRequestDTO, buildHeaders());

		return (ResponseEntity<SetCustomPropertyResponseDTO>) 
					twinPushConnectionService.sendRequestToTwinpush(HttpMethod.POST,
											PushConstants.TWINPUSH_URL_SET_CUSTOM_PROPERTY,
											uriVariablesMap,
											httpEntity,
											SetCustomPropertyResponseDTO.class);
	}

	



	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ResponseEntity<ClearCustomPropertiesResponseDTO> clearCustomProperties(final Map<String,String> uriVariablesMap) {

		final HttpEntity httpEntity = new HttpEntity(buildHeaders());

		return (ResponseEntity<ClearCustomPropertiesResponseDTO>) 
					twinPushConnectionService.sendRequestToTwinpush(HttpMethod.DELETE,
											PushConstants.TWINPUSH_URL_CLEAR_CUSTOM_PROPERTY,
											uriVariablesMap,
											httpEntity,
											ClearCustomPropertiesResponseDTO.class);
	}
}