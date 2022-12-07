package com.xworkz.repository;

import com.xworkz.annotation.Pal;

import com.xworkz.entity.Bumper;

@Pal
public interface BumperRepository {

	boolean save(Bumper entity);
}
