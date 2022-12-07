package com.xworkz.repository;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.Muffler;

@Pal
public interface MufflerRepository {

	boolean save(Muffler entity);
}
