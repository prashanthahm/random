package com.xworkz.service;

import com.xworkz.bangloredto.BangloreDTO;
import com.xworkz.repository.BangloreRepository;
import com.xworkz.repository.BangloreRepositoryImp;

public class BangloreServiceImp implements BangloreService {


	BangloreRepository repository = new BangloreRepositoryImp();
	


	@Override
	public boolean validateAndSave(BangloreDTO dto) {
		

		String language = dto.getLanguage();
		String country = dto.getCountry();
		String state = dto.getState();
		
				if(language!=null && language.length()>2 && language.length()<25) {
					System.out.println("language is valid");
					if(country!=null && country.length()>2 && country.length()<25) {
						System.out.println("country is valid");
						if(state!=null && state.length()>2 && state.length()<25) {
							System.out.println("state is valid");
							this.repository.save(dto);
						}else {
							System.err.println("state is invalid");
						}
					}else {
						System.err.println("country is invalid");
					}
				}else {
					System.err.println("language is invalid");
				}
			
		return false;
	}
}
