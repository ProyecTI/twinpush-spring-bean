package com.proyecti.twincoders.twinpush.interfaz;

import com.proyecti.twincoders.twinpush.operations.devices.TwinPushDevicesOperations;
import com.proyecti.twincoders.twinpush.operations.notifications.TwinPushNotificationsOperations;
import com.proyecti.twincoders.twinpush.operations.statistics.TwinPushStatisticsOperations;

public interface TwinPushConnection {

	/**
	 * This getter contains the services related to notifications
	 * 
	 */
	TwinPushNotificationsOperations getTwinPushNotificationsOperations();

	/**
	 * This getter contains the services related to devices
	 * 
	 */	
	TwinPushDevicesOperations getTwinPushDevicesOperations();
	
	/**
	 * This getter contains the services related to different statistics
	 * 
	 */	
	TwinPushStatisticsOperations getTwinPushStatisticsOperations();
	
}
