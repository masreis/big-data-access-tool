package net.marcoreis.bdat.api.controller;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "ETL")
@RestController
@RequestMapping("/v1/etl")
public class ETLController {

	@ApiOperation("Importa os dados de uma fonte")
	@PostMapping("/import")
	public HttpEntity<?> importData(
			@RequestBody Map<String, String> parameters) {
		// send data to messaging
		return ResponseEntity.ok(null);
	}

	@ApiOperation("Exporta dados para um banco de dados")
	@PostMapping("/export")
	public HttpEntity<?> exportData(
			@RequestBody Map<String, String> parameters) {
		// send data to messaging
		return ResponseEntity.ok(null);
	}

	@ApiOperation("Recupera a lista de dados disponíveis na fonte")
	@PostMapping("/list")
	public HttpEntity<?> listData(
			@RequestBody Map<String, String> parameters) {
		// send data to messaging
		return ResponseEntity.ok(null);
	}

}
