package com.odc.login.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsrIdRequestDto {

	private String usrId            ;
	private String lgnId            ;
	private String cstmId          ;              //고객사아이디
	private String trgtSeq         ;              //대상순번
}
