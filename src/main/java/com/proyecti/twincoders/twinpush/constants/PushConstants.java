package com.proyecti.twincoders.twinpush.constants;

/**
 * This class contains every mail related constant to be used by the application
 * 
 * @author
 *
 */
public final class PushConstants {

	public static final int MAX_NUMBER_OF_RETRIES = 5;

	public static final String TWINPUSH_APP_VERSION = "v2";

	public static final String TWINPUSH_URL_PREFIX = "http://beta.twinpush.com/api/" + TWINPUSH_APP_VERSION;

	
	/************************************************************************
	 *						  	DEVICES TYPES								*
	 ************************************************************************/

	public static final String TWINPUSH_IPHONE_DEVICE = "Iphone";

	public static final String TWINPUSH_BLACKBERRY_DEVICE = "Blackberry";
	
	public static final String TWINPUSH_ANDROID_DEVICE = "Android";

	
	
	/************************************************************************
	 *							HEADER PARAMS							    *		
	 ************************************************************************/

	public static final String TWINPUSH_API_TOKEN_KEY = "X-TwinPush-REST-API-Token";
	
	public static final String TWINPUSH_API_TOKEN_VALUE = "TOKEN";

	
	
	/************************************************************************
	 *							URL VARIABLE PARAMS							*		
	 ************************************************************************/

	public static final String TWINPUSH_DEVICE_ID_PARAM = "device_id";

	public static final String TWINPUSH_APP_ID_PARAM = "app_id";
	
	public static final String TWINPUSH_GENERIC_ID_PARAM = "id";
	
	public static final String TWINPUSH_NOTIFICATION_ID_PARAM = "notification_id";
	

	
	/************************************************************************
	 *							DEVICES SERVICES							*
	 ************************************************************************/
	
	public static final String TWINPUSH_URL_CREATE_DEVICE = TWINPUSH_URL_PREFIX + "/apps/{"+ TWINPUSH_APP_ID_PARAM + "}/devices";

	public static final String TWINPUSH_URL_DESTROY_DEVICE = TWINPUSH_URL_PREFIX + "/apps/{" + TWINPUSH_APP_ID_PARAM + "/devices/{" + TWINPUSH_GENERIC_ID_PARAM+"}";
	
	public static final String TWINPUSH_URL_SET_CUSTOM_PROPERTY = TWINPUSH_URL_PREFIX + "/apps/{"+ TWINPUSH_APP_ID_PARAM + "}/devices/{"+ TWINPUSH_DEVICE_ID_PARAM + "}/set_custom_property";

	public static final String TWINPUSH_URL_CLEAR_CUSTOM_PROPERTY = TWINPUSH_URL_PREFIX + "/apps/{"+ TWINPUSH_APP_ID_PARAM + "}/devices/{"+ TWINPUSH_DEVICE_ID_PARAM + "}/clear_custom_property";

	

	/************************************************************************
	 *						NOTIFICATIONS SERVICES							*
	 ************************************************************************/

	public static final String TWINPUSH_URL_SHOW_NOTIFICATION_BY_APP = TWINPUSH_URL_PREFIX + "/apps/{"+ TWINPUSH_APP_ID_PARAM + "/notifications/{" + TWINPUSH_NOTIFICATION_ID_PARAM + "}";

	public static final String TWINPUSH_URL_SHOW_NOTIFICATION_BY_DEVICE = TWINPUSH_URL_PREFIX + "/devices/{"+ TWINPUSH_DEVICE_ID_PARAM + "}/notifications/{" + TWINPUSH_NOTIFICATION_ID_PARAM + "}";

	public static final String TWINPUSH_URL_ONE_PUSH_NOTIFICATION = TWINPUSH_URL_PREFIX + "/apps/{" + TWINPUSH_APP_ID_PARAM + "}/notifications";
	
	public static final String TWINPUSH_URL_APP_PUSH_NOTIFICATION = TWINPUSH_URL_PREFIX + "/apps/{" + TWINPUSH_APP_ID_PARAM + "}/notifications";

	public static final String TWINPUSH_URL_OPEN_NOTIFICATION = TWINPUSH_URL_PREFIX + "/open_notification";

	public static final String TWINPUSH_URL_SEARCH_NOTIFICATION = TWINPUSH_URL_PREFIX + "/apps/{"+ TWINPUSH_APP_ID_PARAM + "}/devices/{"+ TWINPUSH_DEVICE_ID_PARAM + "}/search_notifications";

	
	/************************************************************************
	 *							BADGES SERVICES								*
	 ************************************************************************/

	public static final String TWINPUSH_URL_UPDATE_BADGE = TWINPUSH_URL_PREFIX + "/update_badge";

	

	/************************************************************************
	 *						  STATISTICS SERVICES							*
	 ************************************************************************/

	public static final String TWINPUSH_URL_REPORT_STATISTICS = TWINPUSH_URL_PREFIX + "/report_statistics";
	
	public static final String TWINPUSH_URL_OPEN_APP = TWINPUSH_URL_PREFIX + "/open_app";

	public static final String TWINPUSH_URL_CLOSE_APP = TWINPUSH_URL_PREFIX + "/close_app";

}