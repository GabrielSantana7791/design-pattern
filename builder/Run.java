package builder;

import builder.classes.Server;
import builder.director.ServerDefaultDirector;

public class Run {
	public static void main(String[] args) {
		Server server = ServerDefaultDirector.getServer();
		server.addLog("Hello World");
		
		System.out.println(server.toString());
	}
}
