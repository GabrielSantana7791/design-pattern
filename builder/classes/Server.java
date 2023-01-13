package builder.classes;

import java.util.Date;

public class Server {
	private String name;
	private String ip;
	private int port;
	private int expRate;
	private int maxPlayersNumber;
	private Date date;
	private String log;

	public Server() {
		log = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getExpRate() {
		return expRate;
	}

	public void setExpRate(int expRate) {
		this.expRate = expRate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLog() {
		return log;
	}

	public void addLog(String log) {
		this.log = this.log + "\n" + log;
	}

	public int getMaxPlayersNumber() {
		return maxPlayersNumber;
	}

	public void setMaxPlayersNumber(int maxPlayersNumber) {
		this.maxPlayersNumber = maxPlayersNumber;
	}

	@Override
	public String toString() {
		return "Server [name=" + name + ", ip=" + ip + ", port=" + port + ", expRate=" + expRate + ", maxPlayersNumber="
				+ maxPlayersNumber + ", date=" + date + ", log=" + log + "]";
	}	
}
