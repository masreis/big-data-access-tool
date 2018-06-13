package net.marcoreis.bdat.application;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class GenericDataObject {
	private String id;
	private String data;
	private String table;
}
