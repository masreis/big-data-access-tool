package net.marcoreis.bdat.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.marcoreis.bdat.entity.DataStore;
import net.marcoreis.bdat.repository.DataStoreRepository;

@Api(tags = "Data Store")
@RestController
@RequestMapping("/v1/datastore")
public class DataStoreController {

	@Autowired
	private DataStoreRepository dataStoreRepository;

	@ApiOperation("Recupera todas as data stores disponíveis")
	@GetMapping
	public HttpEntity<?> findAll() {
		try {
			List<DataStore> all = dataStoreRepository.findAll();
			return ResponseEntity.ok(all);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(e.getMessage(),
					HttpStatus.NOT_FOUND);
		}
	}

	@ApiOperation("Recupera as informações de uma data store")
	@GetMapping("/{id}")
	public HttpEntity<?> findById(@PathVariable String id) {
		return ResponseEntity.ok(null);
	}
}
