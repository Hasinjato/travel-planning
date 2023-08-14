package com.travel.planning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.planning.model.Transport;
import com.travel.planning.repository.TransportRepository;

@Service
public class TransportServiceImpl {
	@Autowired
	private TransportRepository transportRepository;
	
	public List<Transport> getAllTransports() {
		return transportRepository.findAll();
	}

	public void saveTransport(Transport transport) {
		this.transportRepository.save(transport);
	}

	public Transport getTransportById(long id) {
		Optional<Transport> optional = transportRepository.findById(id);
		Transport transport;
		if (optional.isPresent()) {
			transport =  optional.get();
		} else {
			throw new RuntimeException(" Transport non trouvé :: " + id);
		}
		return transport;
	}
	
	public void updateTransport(Transport transport)
	{
		if (transportRepository.existsById(transport.getId()))
		{
			transportRepository.save(transport);
		}
		return;
	}

	public void deleteTransportById(long id) {
		this.transportRepository.deleteById(id);
	}
	
	public long getNbTransport() {
		return transportRepository.count();
	}
}
