package org.cskj.spring.demo.service.impl;

import java.util.List;

import org.cskj.spring.demo.bean.Power;
import org.cskj.spring.demo.mapper.PowerMapper;
import org.cskj.spring.demo.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PowerServiceImpl implements PowerService{
	
	@Autowired
	private PowerMapper gm;

	@Override
	public List<Power> queryPowerAll() {
		return gm.queryPowerAll();
	}

	@Override
	public int addPower(Power power) {
		return gm.addPower(power);
	}


	
}
