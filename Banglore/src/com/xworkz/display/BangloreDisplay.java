package com.xworkz.display;

import com.xworkz.bangloredto.BangloreDTO;
import com.xworkz.service.BangloreService;
import com.xworkz.service.BangloreServiceImp;

public class BangloreDisplay {

	public static void main(String[] args) {
		BangloreDTO BangloreDTO = new BangloreDTO("kannada", "india", "karnataka");
		BangloreDTO BangloreDTO1 = new BangloreDTO("malayalam", "india", "kerala");
		BangloreDTO BangloreDTO2 = new BangloreDTO("Hindi", "india", "ka");
		BangloreDTO BangloreDTO3 = new BangloreDTO("marati", "india", "maharashtra");
		BangloreDTO BangloreDTO4 = new BangloreDTO("Bengali", "india", "WB");
		
		BangloreService service =new BangloreServiceImp();
		service.validateAndSave(BangloreDTO);
		service.validateAndSave(BangloreDTO1);
		service.validateAndSave(BangloreDTO2);
		service.validateAndSave(BangloreDTO3);
		service.validateAndSave(BangloreDTO4);
		

	}

	}


