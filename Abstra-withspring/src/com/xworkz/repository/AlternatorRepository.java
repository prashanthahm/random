package com.xworkz.repository;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.Alternator;

@Pal
public interface AlternatorRepository {
	boolean save(Alternator entity);

}
