package net.marcoreis.etl;

import org.apache.sqoop.tool.ListTablesTool;
import org.apache.sqoop.tool.SqoopTool;

import com.cloudera.sqoop.SqoopOptions;


/**
 * 
 * 
 * @author marco
 *
 */
public class BulkImportUtil {
	public static void main(String[] args) {
	}

	public void generateTableNamesFile() {
		SqoopTool listTables = new ListTablesTool();
		listTables.run(getOptions());
	}

	private SqoopOptions getOptions() {
		// TODO Auto-generated method stub
		return null;
	}
}
