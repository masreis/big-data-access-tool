package net.marcoreis.bdat.api.controller;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Data Access")
@RestController
@RequestMapping("/v1/dataaccess")
public class DataAccessController {

	@ApiOperation("Insere um registro no sistema de mensageria")
	@PostMapping("/insert")
	public HttpEntity<?> insert(
			@RequestBody Map<String, String> value) {
		// send data to messaging
		return ResponseEntity.ok(null);
	}

	@ApiOperation("Recupera um registro do NoSQL")
	@GetMapping("/{datasource}/{id}")
	public HttpEntity<?> findById(
			@PathVariable String datasource,
			@PathVariable String id) {
		return ResponseEntity.ok(null);
	}

	@ApiOperation("Atualiza um registro")
	@PutMapping("/{datasource}/{id}")
	public HttpEntity<?> update(@PathVariable String datasource,
			@PathVariable String id,
			@RequestBody Map<String, String> value) {
		return ResponseEntity.ok(null);
	}

	@ApiOperation("Exclui um registro")
	@DeleteMapping("/{datasource}/{id}")
	public HttpEntity<?> delete(@PathVariable String datasource,
			@PathVariable String id) {
		return ResponseEntity.ok(null);
	}

	@ApiOperation("Consulta registros por parâmetros")
	@PostMapping("/findByParameter")
	public HttpEntity<?> findByParameter(
			@RequestBody Map<String, String> parameter) {
		return ResponseEntity.ok(null);
	}

}
