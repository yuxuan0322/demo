package org.cskj.spring.demo.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.cskj.spring.demo.bean.Power;


@Mapper
public interface PowerMapper {

	List<Power> queryPowerAll();
	
	int addPower(Power power);
}
