package net.marcoreis.etl;

import org.apache.sqoop.util.OptionsFileUtil;

import com.cloudera.sqoop.SqoopOptions;
import com.cloudera.sqoop.tool.ListTablesTool;
import com.cloudera.sqoop.tool.SqoopTool;

/**
 * 
 * 
 * @author marco
 *
 */
public class BulkImportUtil {

	public void generateTableNamesFile(String[] args)
			throws Exception {
		SqoopTool listTables = new ListTablesTool();
		listTables.run(getOptions(args));
	}

	private SqoopOptions getOptions(String[] args)
			throws Exception {
		SqoopOptions sqoopOptions = new SqoopOptions();
		sqoopOptions.setExtraArgs(args);
		return sqoopOptions;
	}

	public static void main(String[] args) {
		try {
			new BulkImportUtil().generateTableNamesFile(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
