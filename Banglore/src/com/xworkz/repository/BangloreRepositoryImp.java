package com.xworkz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.bangloredto.BangloreDTO;
import com.xworkz.enumdetail.Account;

public class BangloreRepositoryImp implements BangloreRepository {

	@Override
	public boolean save(BangloreDTO dto) {
		
		try {
			Connection connection = DriverManager.getConnection(Account.URL.getValues(), Account.USERNAME.getValues(), Account.SECRET.getValues());
			String insert = "insert into banglore values (?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(insert);
			prepareStatement.setString(1, dto.getLanguage());
			prepareStatement.setString(2, dto.getCountry());
			prepareStatement.setString(3, dto.getState());

			int executeUpdate = prepareStatement.executeUpdate();
			if(executeUpdate>0) {
				System.out.println(executeUpdate+" : "+dto);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

}
