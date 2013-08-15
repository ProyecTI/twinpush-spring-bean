package com.proyecti.twincoders.twinpush.operations.statistics;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.proyecti.twincoders.twinpush.dto.request.closedApp.ClosedAppRequestDTO;
import com.proyecti.twincoders.twinpush.dto.request.openedApp.OpenedAppRequestDTO;
import com.proyecti.twincoders.twinpush.dto.request.openedNotification.OpenedNotificationRequestDTO;
import com.proyecti.twincoders.twinpush.dto.request.reportStatistics.ReportStatisticsRequestDTO;
import com.proyecti.twincoders.twinpush.dto.response.closedApp.ClosedAppResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.openedApp.OpenedAppResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.openedNotification.OpenedNotificationResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.reportStatistics.ReportStatisticsResponseDTO;


public interface TwinPushStatisticsOperations {


	/**
	 * The user opens a notification.
	 * 
	 * The open_at parameter should be a timestamp, if it is in another format an error code will be returned.
	 */
	ResponseEntity<OpenedNotificationResponseDTO> openedNotification(Map<String, String> uriVariablesMap, OpenedNotificationRequestDTO openedNotificationRequestDTO);


	/**
	 * The user opens the app. This is useful to get statistics of use.
	 * 
	 * The open_at parameter should be a timestamp, if it is in another format an error code will be returned.
	 */
	ResponseEntity<OpenedAppResponseDTO> openedApp(Map<String, String> uriVariablesMap, OpenedAppRequestDTO openedAppRequestDTO);


	/**
	 * The user closes the app. This is useful to get statistics of use.
	 * 
	 * The closed_at parameter should be a timestamp, if it is in another format an error code will be returned.
	 */
	ResponseEntity<ClosedAppResponseDTO> closedApp(Map<String, String> uriVariablesMap, ClosedAppRequestDTO closedAppRequestDTO);


	/**
	 * Updated the statistics of a device. The following attributes are available:
	 */
	ResponseEntity<ReportStatisticsResponseDTO> reportStatistics(Map<String, String> uriVariablesMap, ReportStatisticsRequestDTO reportStatisticsRequestDTO);

}
