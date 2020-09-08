package org.cskj.spring.demo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.cskj.spring.demo.bean.Power;
import org.cskj.spring.demo.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PowerController {

	@Autowired
	private PowerService gs;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	/*
	 * restful风格
	 * get查询
	 * post添加
	 * put修改
	 * delete删除
	 */
	
	@GetMapping(value="queryPowerAll")
	public List<Power> queryPowerAll(){
		return gs.queryPowerAll();
	}
	
	@PostMapping(value="addPower")
	public boolean addPower(@RequestBody Power power) throws ParseException {
		Date parse = sdf.parse(power.getOccupation());
		power.setOccupation(sdf.format(parse));
		return gs.addPower(power) > 0 ? true : false;
	}
	
}
