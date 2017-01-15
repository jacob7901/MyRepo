import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigSetting {
	public static String dirPath;
	public static String dst_fileName;
	public static String monitorCycle;
	private String cfgFileName="D:/workspace/GitRepo/FileMonitor/conf";
	// private String cfgDirName="D:/workspace/java/FileMonitoring/conf/config";
	
	// Init 
	public void initDir() {
		File filePath = new File(cfgFileName);
		// ConfigSetting c = new ConfigSetting();
		System.out.println(cfgFileName);
		
		// Init properties
		Properties prop = new Properties();
		try (InputStream inputStream = new FileInputStream(filePath)) {
			// Loading the properties. 
			prop.load(inputStream);
		} catch (IOException ex) {
			System.out.println("Problem occurs when reading file.");
			ex.printStackTrace();
			return;
		}
		// Getting Properties
		monitorCycle = prop.getProperty("MONITORING");
		System.out.println(monitorCycle);
	}
}