package com.xworkz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hospitalDTO.HospitalDTO;

public class HospitalRepositoryImp implements HospitalRepository {

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("Hospital Dave is saved"+dto);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Xworkzodc@123");
			String save = "insert into hospital values ("+dto.getId()+",'"+dto.getName()+"','"+dto.getSpecialist()+"','"+dto.getFounder()+"',"+dto.getSince()+")";
			Statement createStatement = connection.createStatement();
			System.out.println(save);
			int executeUpdate = createStatement.executeUpdate(save);
			if(executeUpdate>0) {
				System.out.println(executeUpdate);
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

}
