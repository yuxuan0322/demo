package org.cskj.spring.demo.service;

import java.util.List;

import org.cskj.spring.demo.bean.Power;


public interface PowerService {

	List<Power> queryPowerAll();
	
	int addPower(Power power);
}
