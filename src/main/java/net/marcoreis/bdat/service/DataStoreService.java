package net.marcoreis.bdat.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.marcoreis.bdat.repository.DataStoreRepository;

@Service
public class DataStoreService implements Serializable {

	private static final long serialVersionUID =
			-9173000826918880280L;

	@Autowired
	private DataStoreRepository dataStoreRepository;

}
