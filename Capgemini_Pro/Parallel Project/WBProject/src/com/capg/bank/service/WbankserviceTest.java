package com.capg.bank.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capg.bank.bean.Wbank;

class WbankserviceTest {

	Wbankservice wb=null;
	@BeforeEach
	void init()
	{
		wb=new Wbankservice();
	}
	@Test
	void test() {
		assertEquals("INVALID DEPOSIT DETAILS",wb.deposit("WBAN000091000001", " ", 0));
	}

	@Test
	void test1() {
		assertEquals("INVALID ACCOUNT NUMBER",wb.checkBalance("WBAN0000910000001"));
	}
	
	@Test
	void test2() {
		assertEquals("INVALID FUND TRANSFER DETAILS",wb.fundtran("WBAN0000910000002", " ", "WBAN0000143", 0));
	}
	
	@Test
	void test3() {
		assertEquals("INVALID WITHDRAWL DETAILS",wb.withdraw("WBAN0000910000003"," ", 0));
	}
	
	@Test
	void test4() {
		assertEquals("INVALID DETAILS",wb.create_acc(new Wbank(" "," "," "," ",000011112222333," "," ",0," ",0," ")));
	}
}
