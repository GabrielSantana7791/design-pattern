package creational.builder.director;

import creational.builder.builder.ServerBuilder;
import creational.builder.classes.Server;

public class ServerDefaultDirector {
	public static Server getServer() {
		ServerBuilder serverBuilder = new ServerBuilder();
		serverBuilder.setCurrentDate()
			.setExpRate(1)
			.setIp("localhost")
			.setPort(8080)
			.setMaxPlayersNumber(5)
			.setName("Builder Server");
		
		Server server = serverBuilder.getServer();
		server.addLog("Server has started successfully");
		
		return serverBuilder.getServer();			
	}
}
