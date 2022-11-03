package defaultpackage;

public class Object {

	private String inputFileName;
	private String inputReadFileName;

	 	// Set inputFileName given by the user
		public String setFileName(String inputFileName) {
			this.inputFileName = inputFileName;
			return inputFileName;
		}
		
		// Set setReadFileName given by the user
		public String setReadFileName(String inputReadFileName) {
			this.inputReadFileName = inputReadFileName;
			return inputReadFileName;
		}
}


