package nullProject;
import static spark.Spark.*;

public class main {
	
		public static void main(final String[] args) {
			ProcessBuilder process = new ProcessBuilder();
	
			// Defining server's port.
			int port;
			if(process.environment().get("PORT") != null) {
	            port = Integer.parseInt(process.environment().get("PORT"));
			} else {
				port = 8000;
			}
			
 			port(port);
			
			// front
			staticFileLocation("public");
			
		}
}