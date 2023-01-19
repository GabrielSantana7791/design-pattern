package creational.builder;

import creational.builder.classes.Server;
import creational.builder.director.ServerDefaultDirector;

public class Run {
	public static void main(String[] args) {
		Server server = ServerDefaultDirector.getServer();
		server.addLog("Hello World");
		
		System.out.println(server.toString());
	}
}
