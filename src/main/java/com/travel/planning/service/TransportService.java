package com.travel.planning.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.travel.planning.model.Transport;

@Service
public abstract class TransportService extends TransportServiceImpl {
	public abstract List<Transport> getAllTransport();
	public abstract void saveTransport(Transport travel);
	public abstract Transport getTransportById(long id);
	public abstract void deleteTransportById(long id);
}
