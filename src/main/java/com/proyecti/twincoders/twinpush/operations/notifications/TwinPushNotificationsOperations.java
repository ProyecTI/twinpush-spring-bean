package com.proyecti.twincoders.twinpush.operations.notifications;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.proyecti.twincoders.twinpush.dto.request.pushNotification.PushNotificationRequestDTO;
import com.proyecti.twincoders.twinpush.dto.request.pushNotifications.PushNotificationsAliasesRequestDTO;
import com.proyecti.twincoders.twinpush.dto.request.pushNotifications.PushNotificationsIdsRequestDTO;
import com.proyecti.twincoders.twinpush.dto.response.pushNotification.PushNotificationResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.pushNotifications.PushNotificationsResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.showNotification.ShowNotificationByAppResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.showNotification.ShowNotificationByDeviceResponseDTO;


public interface TwinPushNotificationsOperations {


	/**
	 * Returns all the details of a notification.
	 */
	ResponseEntity<ShowNotificationByDeviceResponseDTO> showNotificationByDevice(Map<String, String> uriVariablesMap);

		
	/**
	 * Returns all the details of a notification.
	 */
	ResponseEntity<ShowNotificationByAppResponseDTO> showNotificationByApp(Map<String, String> uriVariablesMap);


	/***
	 * Creates a new notification with a date to be sent.
	 * 
	 */
	ResponseEntity<PushNotificationResponseDTO> pushNotification(final Map<String,String> uriVariablesMap, PushNotificationRequestDTO pushNotificationRequestDTO);

	
	/**
	 * Creates a new notification just like the method for 1 device but several devices can be passed. 
	 * All the devices must belong to the app specified in the uri with :app_id.
	 * 
	 * 		
	 */
	ResponseEntity<PushNotificationsResponseDTO> pushNotificationsByAliases(Map<String, String> uriVariablesMap, PushNotificationsAliasesRequestDTO pushNotificationsRequestDTO);
	
	/**
	 * Creates a new notification just like the method for 1 device but several devices can be passed. 
	 * All the devices must belong to the app specified in the uri with :app_id.
	 * 		
	 */
	ResponseEntity<PushNotificationsResponseDTO> pushNotificationsByIds(Map<String, String> uriVariablesMap, PushNotificationsIdsRequestDTO pushNotificationsRequestDTO);
	
	
}
