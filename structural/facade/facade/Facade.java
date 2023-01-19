package structural.facade.facade;

import structural.facade.classes.ApiCon;
import structural.facade.classes.DbCon;
import structural.facade.classes.ServerInit;

public class Facade {	
	
	@SuppressWarnings("unused")
	public void init() {
		DbCon dbCon = new DbCon();
		ApiCon apiCon = new ApiCon();
		ServerInit serverInit = new ServerInit();
	}	
}
