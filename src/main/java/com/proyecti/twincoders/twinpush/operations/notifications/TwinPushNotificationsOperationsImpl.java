package com.proyecti.twincoders.twinpush.operations.notifications;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.proyecti.twincoders.twinpush.constants.PushConstants;
import com.proyecti.twincoders.twinpush.dto.request.pushNotification.PushNotificationRequestDTO;
import com.proyecti.twincoders.twinpush.dto.request.pushNotifications.PushNotificationsAliasesRequestDTO;
import com.proyecti.twincoders.twinpush.dto.request.pushNotifications.PushNotificationsIdsRequestDTO;
import com.proyecti.twincoders.twinpush.dto.response.pushNotification.PushNotificationResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.pushNotifications.PushNotificationsResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.showNotification.ShowNotificationByAppResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.showNotification.ShowNotificationByDeviceResponseDTO;
import com.proyecti.twincoders.twinpush.operations.AbstractTwinPushOperations;

public class TwinPushNotificationsOperationsImpl extends AbstractTwinPushOperations implements TwinPushNotificationsOperations 
{
	
	public TwinPushNotificationsOperationsImpl(String token)
	{
		super(token);
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ResponseEntity<ShowNotificationByDeviceResponseDTO> showNotificationByDevice(final Map<String,String> uriVariablesMap)
	{
		final HttpEntity httpEntity = new HttpEntity(buildHeaders());

		return (ResponseEntity<ShowNotificationByDeviceResponseDTO>) 
				twinPushConnectionService.sendRequestToTwinpush(HttpMethod.GET,
											PushConstants.TWINPUSH_URL_SHOW_NOTIFICATION_BY_DEVICE,
											uriVariablesMap,
											httpEntity,
											ShowNotificationByDeviceResponseDTO.class);
	}


	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ResponseEntity<ShowNotificationByAppResponseDTO> showNotificationByApp(final Map<String,String> uriVariablesMap)
	{
		final HttpEntity httpEntity = new HttpEntity(buildHeaders());

		return (ResponseEntity<ShowNotificationByAppResponseDTO>) 
				twinPushConnectionService.sendRequestToTwinpush(HttpMethod.GET,
											PushConstants.TWINPUSH_URL_SHOW_NOTIFICATION_BY_APP,
											uriVariablesMap,
											httpEntity,
											ShowNotificationByAppResponseDTO.class);
	}


	
	
	@SuppressWarnings("unchecked")
	public ResponseEntity<PushNotificationResponseDTO> pushNotification(final Map<String,String> uriVariablesMap, final PushNotificationRequestDTO pushNotificationRequestDTO) 
	{
		final HttpEntity<PushNotificationRequestDTO> httpEntity = new HttpEntity<PushNotificationRequestDTO>(pushNotificationRequestDTO, buildHeaders());

		return (ResponseEntity<PushNotificationResponseDTO>) 
				twinPushConnectionService.sendRequestToTwinpush(HttpMethod.POST,
											PushConstants.TWINPUSH_URL_ONE_PUSH_NOTIFICATION, 
											uriVariablesMap,
											httpEntity,
											PushNotificationResponseDTO.class);
	}




	@SuppressWarnings("unchecked")
	public ResponseEntity<PushNotificationsResponseDTO> pushNotificationsByAliases(final Map<String,String> uriVariablesMap, final PushNotificationsAliasesRequestDTO pushNotificationsRequestDTO) {

		final HttpEntity<PushNotificationsAliasesRequestDTO> httpEntity = new HttpEntity<PushNotificationsAliasesRequestDTO>(pushNotificationsRequestDTO, buildHeaders());

		return (ResponseEntity<PushNotificationsResponseDTO>) 
				twinPushConnectionService.sendRequestToTwinpush(HttpMethod.POST,
											PushConstants.TWINPUSH_URL_APP_PUSH_NOTIFICATION, 
											uriVariablesMap,
											httpEntity,
											PushNotificationsResponseDTO.class);
	}

	
	
	@SuppressWarnings("unchecked")
	public ResponseEntity<PushNotificationsResponseDTO> pushNotificationsByIds(final Map<String,String> uriVariablesMap, final PushNotificationsIdsRequestDTO pushNotificationsRequestDTO) {

		final HttpEntity<PushNotificationsIdsRequestDTO> httpEntity = new HttpEntity<PushNotificationsIdsRequestDTO>(pushNotificationsRequestDTO, buildHeaders());

		return (ResponseEntity<PushNotificationsResponseDTO>) 
				twinPushConnectionService.sendRequestToTwinpush(HttpMethod.POST,
											PushConstants.TWINPUSH_URL_APP_PUSH_NOTIFICATION, 
											uriVariablesMap,
											httpEntity,
											PushNotificationsResponseDTO.class);
	}

}