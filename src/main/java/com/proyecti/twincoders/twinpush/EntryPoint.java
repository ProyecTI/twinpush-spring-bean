package com.proyecti.twincoders.twinpush;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proyecti.twincoders.twinpush.constants.PushConstants;
import com.proyecti.twincoders.twinpush.dto.request.createDevice.CreateDeviceRequestDTO;
import com.proyecti.twincoders.twinpush.interfaz.TwinPushConnection;
import com.proyecti.twincoders.twinpush.operations.TwinPushConnectionImpl;

public final class EntryPoint {

	private static TwinPushConnection twinPushConnection;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");

		final String host = PushConstants.TWINPUSH_API_TOKEN_KEY;
		final String version = "aa";
		final String token = "1602b6937926fa67853a19f0d29225d5";
		
		twinPushConnection = new TwinPushConnectionImpl(host, version, token);
		addDevice();
		destroyDevice();
		
	}

	public static void addDevice()
	{
		final Map<String, String> uriVariablesMap = new HashMap<String, String>();
		uriVariablesMap.put("app_id", "14");
		
		final CreateDeviceRequestDTO createDeviceRequestDTO = new CreateDeviceRequestDTO();
		
		createDeviceRequestDTO.setAlias_device("pepito");
		createDeviceRequestDTO.setUdid("1111.2222.3333.4444");
		createDeviceRequestDTO.setRegid("234532432423444dfgds34");

		twinPushConnection.getTwinPushDevicesOperations().createDevice(uriVariablesMap , createDeviceRequestDTO);

	}
	
	public static void destroyDevice()
	{
		final Map<String, String> uriVariablesMap = new HashMap<String, String>();
		uriVariablesMap.put("app_id", "14");
		uriVariablesMap.put("id", "19452");
		twinPushConnection.getTwinPushDevicesOperations().destroyDevice(uriVariablesMap);
		
	}
}
