package com.donica.wqacvr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.donica.App;
import com.donica.wqacvr.dto.TerminalDTO;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class TerminalTest {

	@Autowired
	TerminalService terminalService;
	
	@Test
	public void testQueryById() {
		TerminalDTO terminal = terminalService.queryById(503);
		System.out.println(terminal);
	}

}
