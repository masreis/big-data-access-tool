package net.marcoreis.bdat.etl;

import com.cloudera.sqoop.SqoopOptions;
import com.cloudera.sqoop.tool.ListTablesTool;

/**
 * 
 * 
 * @author marco
 *
 */
public class BulkImportUtil {

	public void generateTableNamesFile(String[] args)
			throws Exception {
		ListTablesTool tool = new ListTablesTool();
		int ret = tool.run(getOptions(args));
		System.out.println(ret);
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
