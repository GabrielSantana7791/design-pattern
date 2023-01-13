package builder.builder;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import builder.classes.Server;

public class ServerBuilder {
	private Server server;
	
	public ServerBuilder() {
		server = new Server();
	}
		
	public void reset() {
		this.server = new Server();
	}
	
	public Server getServer() {
		return this.server;
	}
	
	public ServerBuilder setPort(int port) {
		// algoritmo complexo blabla
		System.out.println("Port: " + port + " successfully set");
		
		this.server.setPort(port);
		
		return this;
	}
	
	public ServerBuilder setMaxPlayersNumber(int maxPlayerNumber) {
		// algoritmo complexo blabla
		System.out.println("maxPlayerNumber: " + maxPlayerNumber + " successfully set");
		
		this.server.setMaxPlayersNumber(maxPlayerNumber);
		
		return this;
	}
	
	public ServerBuilder setName(String name) {
		// algoritmo complexo blabla
		System.out.println("Name: " + name + " successfully set");
		
		this.server.setName(name);
		
		return this;
	}
	
	public ServerBuilder setIp(String ip) {
		// algoritmo complexo blabla
		System.out.println("Ip: " + ip + " successfully set");
		
		this.server.setIp(ip);
		
		return this;
	}
	
	public ServerBuilder setExpRate(int expRate) {
		// algoritmo complexo blabla
		System.out.println("Exp Rate: " + expRate + " successfully set");
		
		this.server.setExpRate(expRate);
		
		return this;
	}
	
	public ServerBuilder setDate(Date date) {
		// algoritmo complexo blabla
		System.out.println("Date: " + date + " successfully set");
		
		this.server.setDate(date);
		
		return this;
	}
	
	public ServerBuilder setCurrentDate() {
		Date in = new Date();
		LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
		Date out = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
		
		this.server.setDate(out);
		
		return this;
	}
}
