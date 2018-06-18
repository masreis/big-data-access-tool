package net.marcoreis.bdat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.marcoreis.bdat.entity.DataStore;
import net.marcoreis.bdat.repository.DataStoreRepository;

@Api(tags = "DataStore")
@RestController
@RequestMapping("/v1/data")
public class DataStoreController {

	@Autowired
	private DataStoreRepository dataStoreRepository;

	@ApiOperation("Find all data stores")
	@GetMapping
	public HttpEntity<?> findAll() {
		try {
			Page<DataStore> all = dataStoreRepository.findAll();
			return ResponseEntity.ok(all);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(e.getMessage(),
					HttpStatus.NOT_FOUND);
		}
	}

}
