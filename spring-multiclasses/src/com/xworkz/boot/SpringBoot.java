package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beans.Aeroplane;
import com.xworkz.beans.Airport;
import com.xworkz.beans.Apartment;
import com.xworkz.beans.College;
import com.xworkz.beans.Cricket;
import com.xworkz.beans.Fan;
import com.xworkz.beans.Gym;
import com.xworkz.beans.Helicopter;
import com.xworkz.beans.Hospital;
import com.xworkz.beans.Hostel;
import com.xworkz.beans.Hotel;
import com.xworkz.beans.House;
import com.xworkz.beans.Institute;
import com.xworkz.beans.Keyboard;
import com.xworkz.beans.Laptop;
import com.xworkz.beans.Mobile;
import com.xworkz.beans.Mouse;
import com.xworkz.beans.Oyo;
import com.xworkz.beans.Pg;
import com.xworkz.beans.RailwayStation;
import com.xworkz.beans.Restaurent;
import com.xworkz.beans.School;
import com.xworkz.beans.Ship;
import com.xworkz.beans.Shop;
import com.xworkz.beans.ShowRoom;
import com.xworkz.configuration.SpringConfig;

public class SpringBoot {

	public static void main(String[] args) {
		
ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		
		System.out.println(context.getBeanDefinitionCount());
		
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}
		
		Hotel bean = context.getBean(Hotel.class);
		bean.display();
		System.out.println(bean.getHotelName());
		System.out.println(bean.getHotelRating());

		Hospital bean1 = context.getBean(Hospital.class);
		bean1.display();
		System.out.println(bean1.getHospitalName());
		System.out.println(bean1.getHospitalRating());

		Institute bean2 = context.getBean(Institute.class);
		bean2.display();
		System.out.println(bean2.getInstituteName());
		System.out.println(bean2.getInstituteRating());

		Pg bean3 = context.getBean(Pg.class);
		bean3.display();
		System.out.println(bean3.getPgName());
		System.out.println(bean3.getPgRent());

		Hostel bean4 = context.getBean(Hostel.class);
		bean4.display();
		System.out.println(bean4.getHostelName());
		System.out.println(bean4.getHostelRent());

		House bean5 = context.getBean(House.class);
		bean5.display();
		System.out.println(bean5.getHouseName());
		System.out.println(bean5.getHouseCost());

		Shop bean6 = context.getBean(Shop.class);
		bean6.display();
		System.out.println(bean6.getShopName());
		System.out.println(bean6.getShopRent());

		Apartment bean7 = context.getBean(Apartment.class);
		bean7.display();
		System.out.println(bean7.getApartmentName());
		System.out.println(bean7.getNoOfFloors());

		Aeroplane bean8 = context.getBean(Aeroplane.class);
		bean8.display();
		System.out.println(bean8.getCompany());
		System.out.println(bean8.getNoOfSeats());

		Ship bean9 = context.getBean(Ship.class);
		bean9.display();
		System.out.println(bean9.getCompany());
		System.out.println(bean9.getNoOfPassengers());

		Helicopter bean10 = context.getBean(Helicopter.class);
		bean10.display();
		System.out.println(bean10.getPilotName());
		System.out.println(bean10.getColor());

		Cricket bean11 = context.getBean(Cricket.class);
		bean11.display();
		System.out.println(bean11.getTeamName());
		System.out.println(bean11.getNoOfPlayers());

		ShowRoom bean12 = context.getBean(ShowRoom.class);
		bean12.display();
		System.out.println(bean12.getShowRoomName());
		System.out.println(bean12.getShowRoomRating());

		Fan bean13 = context.getBean(Fan.class);
		bean13.display();
		System.out.println(bean13.getBrand());
		System.out.println(bean13.getFanPrice());

		Mobile bean14 = context.getBean(Mobile.class);
		bean14.display();
		System.out.println(bean14.getMobileBrand());
		System.out.println(bean14.getMobilePrice());

		Laptop bean15 = context.getBean(Laptop.class);
		bean15.display();
		System.out.println(bean15.getLaptopBrand());
		System.out.println(bean15.getLaptopPrice());

		Oyo bean16 = context.getBean(Oyo.class);
		bean16.display();
		System.out.println(bean16.getOyoName());
		System.out.println(bean16.getOyoPrice());

		Gym bean17 = context.getBean(Gym.class);
		bean17.display();
		System.out.println(bean17.getGymName());
		System.out.println(bean17.getGymFees());

		Restaurent bean18 = context.getBean(Restaurent.class);
		bean18.display();
		System.out.println(bean18.getRestaurentName());
		System.out.println(bean18.getRestaurentRating());
		
		Airport bean19 = context.getBean(Airport.class);
		bean19.display();
		System.out.println(bean19.getCountry());
		System.out.println(bean19.getState());
		
		RailwayStation bean20 = context.getBean(RailwayStation.class);
		bean20.display();
		System.out.println(bean20.getStationName());
		System.out.println(bean20.getNoOfPlatforms());
		
		School bean21 = context.getBean(School.class);
		bean21.display();
		System.out.println(bean21.getSchoolName());
		System.out.println(bean21.getSince());
		
		College bean22 = context.getBean(College.class);
		bean22.display();
		System.out.println(bean22.getCollegeName());
		System.out.println(bean22.getCollegeRating());
		
		Keyboard bean23 = context.getBean(Keyboard.class);
		bean23.display();
		System.out.println(bean23.getKeyBoardBrand());
		System.out.println(bean23.getKeyBoardPrice());
		
		Mouse bean24 = context.getBean(Mouse.class);
		bean24.display();
		System.out.println(bean24.getMouseBrand());
		System.out.println(bean24.getMousePrice());
		
		

	}
		
		

	

}
