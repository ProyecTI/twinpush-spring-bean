package com.proyecti.twincoders.twinpush.operations;

import com.proyecti.twincoders.twinpush.interfaz.TwinPushConnection;
import com.proyecti.twincoders.twinpush.operations.devices.TwinPushDevicesOperations;
import com.proyecti.twincoders.twinpush.operations.devices.TwinPushDevicesOperationsImpl;
import com.proyecti.twincoders.twinpush.operations.notifications.TwinPushNotificationsOperations;
import com.proyecti.twincoders.twinpush.operations.notifications.TwinPushNotificationsOperationsImpl;
import com.proyecti.twincoders.twinpush.operations.statistics.TwinPushStatisticsOperations;
import com.proyecti.twincoders.twinpush.operations.statistics.TwinPushStatisticsOperationsImpl;


public final class TwinPushConnectionImpl implements TwinPushConnection {

	private String host;
	private String apiVersion;
	private String token;
	private TwinPushStatisticsOperations twinPushStatisticsOperations; 
	private TwinPushDevicesOperations twinPushDevicesOperations; 
	private TwinPushNotificationsOperations twinPushNotificationsOperations;
	
	public TwinPushConnectionImpl(String host, String apiVersion, String token) {
		super();
		this.host = host;
		this.apiVersion = apiVersion;
		this.token = token;
		this.twinPushStatisticsOperations = new TwinPushStatisticsOperationsImpl(token);
		this.twinPushDevicesOperations = new TwinPushDevicesOperationsImpl(token);
		this.twinPushNotificationsOperations = new TwinPushNotificationsOperationsImpl(token);
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public TwinPushStatisticsOperations getTwinPushStatisticsOperations() {
		return twinPushStatisticsOperations;
	}

	public TwinPushDevicesOperations getTwinPushDevicesOperations() {
		return twinPushDevicesOperations;
	}

	public TwinPushNotificationsOperations getTwinPushNotificationsOperations() {
		return twinPushNotificationsOperations;
	}

}
