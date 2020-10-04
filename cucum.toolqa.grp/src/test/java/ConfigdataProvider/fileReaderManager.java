package ConfigdataProvider;

public class fileReaderManager {
	
	private static fileReaderManager fileReaderManager = new fileReaderManager();
	 private static ConfigFileReader configFileReader;
	 private static JsonDataReader jsonDataReader;
	 
	 private fileReaderManager() {
	 }
	 
	 public static fileReaderManager getInstance( ) {
	       return fileReaderManager;
	 }
	 
	 public ConfigFileReader getConfigReader() {
	 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	 }
	 
	 public JsonDataReader getJsonReader(){
		 return (jsonDataReader == null) ? new JsonDataReader() : jsonDataReader;
		 }

}
