package com.donica.wqacvr.mapper;

import org.apache.ibatis.annotations.Param;

import com.donica.wqacvr.dto.TerminalDTO;

public interface TerminalMapper {

	TerminalDTO queryById(@Param("terminalId")int terminalId);
	
}
