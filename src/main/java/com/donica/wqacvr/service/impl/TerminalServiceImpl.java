package com.donica.wqacvr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donica.wqacvr.dto.TerminalDTO;
import com.donica.wqacvr.mapper.TerminalMapper;
import com.donica.wqacvr.service.TerminalService;

@Service("terminalService")
public class TerminalServiceImpl implements TerminalService {

	@Autowired
	TerminalMapper terminalMapper;
	
	@Override
	public TerminalDTO queryById(int terminalId) {
		return terminalMapper.queryById(terminalId);
	}

}
