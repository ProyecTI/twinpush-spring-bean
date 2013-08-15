package com.proyecti.twincoders.twinpush.operations.statistics;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.proyecti.twincoders.twinpush.constants.PushConstants;
import com.proyecti.twincoders.twinpush.dto.request.closedApp.ClosedAppRequestDTO;
import com.proyecti.twincoders.twinpush.dto.request.openedApp.OpenedAppRequestDTO;
import com.proyecti.twincoders.twinpush.dto.request.openedNotification.OpenedNotificationRequestDTO;
import com.proyecti.twincoders.twinpush.dto.request.reportStatistics.ReportStatisticsRequestDTO;
import com.proyecti.twincoders.twinpush.dto.response.closedApp.ClosedAppResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.openedApp.OpenedAppResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.openedNotification.OpenedNotificationResponseDTO;
import com.proyecti.twincoders.twinpush.dto.response.reportStatistics.ReportStatisticsResponseDTO;
import com.proyecti.twincoders.twinpush.operations.AbstractTwinPushOperations;

public class TwinPushStatisticsOperationsImpl extends AbstractTwinPushOperations implements TwinPushStatisticsOperations
{
	
	public TwinPushStatisticsOperationsImpl(String token)
	{
		super(token);
	}
	
	@SuppressWarnings("unchecked")
	public ResponseEntity<OpenedNotificationResponseDTO> openedNotification(final Map<String,String> uriVariablesMap, final OpenedNotificationRequestDTO openedNotificationRequestDTO) {

		final HttpEntity<OpenedNotificationRequestDTO> httpEntity = 
				new HttpEntity<OpenedNotificationRequestDTO>(openedNotificationRequestDTO, buildHeaders());

		return (ResponseEntity<OpenedNotificationResponseDTO>) 
				twinPushConnectionService.sendRequestToTwinpush(HttpMethod.POST,
											PushConstants.TWINPUSH_URL_OPEN_NOTIFICATION,
											uriVariablesMap,
											httpEntity,
											OpenedNotificationResponseDTO.class);
	}



	@SuppressWarnings("unchecked")
	public ResponseEntity<OpenedAppResponseDTO> openedApp(final Map<String,String> uriVariablesMap, final OpenedAppRequestDTO openedAppRequestDTO) {

		final HttpEntity<OpenedAppRequestDTO> httpEntity = new HttpEntity<OpenedAppRequestDTO>(openedAppRequestDTO, buildHeaders());

		return (ResponseEntity<OpenedAppResponseDTO>) 
				twinPushConnectionService.sendRequestToTwinpush(HttpMethod.POST,
											PushConstants.TWINPUSH_URL_OPEN_APP,
											uriVariablesMap,
											httpEntity,
											OpenedAppResponseDTO.class);
	}



	@SuppressWarnings("unchecked")
	public ResponseEntity<ClosedAppResponseDTO> closedApp(final Map<String,String> uriVariablesMap, final ClosedAppRequestDTO closedAppRequestDTO) {

		final HttpEntity<ClosedAppRequestDTO> httpEntity = new HttpEntity<ClosedAppRequestDTO>(closedAppRequestDTO, buildHeaders());

		return (ResponseEntity<ClosedAppResponseDTO>) 
				twinPushConnectionService.sendRequestToTwinpush(HttpMethod.POST,
											PushConstants.TWINPUSH_URL_CLOSE_APP,
											uriVariablesMap,
											httpEntity,
											ClosedAppResponseDTO.class);
	}



	@SuppressWarnings("unchecked")
	public ResponseEntity<ReportStatisticsResponseDTO> reportStatistics(final Map<String,String> uriVariablesMap, final ReportStatisticsRequestDTO reportStatisticsRequestDTO) {

		final HttpEntity<ReportStatisticsRequestDTO> httpEntity = new HttpEntity<ReportStatisticsRequestDTO>(reportStatisticsRequestDTO, buildHeaders());

		return (ResponseEntity<ReportStatisticsResponseDTO>) 
				twinPushConnectionService.sendRequestToTwinpush(HttpMethod.POST,
											PushConstants.TWINPUSH_URL_REPORT_STATISTICS,
											uriVariablesMap,
											httpEntity,
											ReportStatisticsResponseDTO.class);
	}
}