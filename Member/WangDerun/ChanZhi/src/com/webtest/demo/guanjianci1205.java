package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class guanjianci1205 extends BaseTest{
	@Test
	public void boketest() throws Exception{
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","wangderun");
		webtest.type("name=password", "123456");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains('首页')]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[13]/a");//点击关键词
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/table/tbody/tr[1]/td[4]/a[1]");//点击编辑链接
		Thread.sleep(1000);
		webtest.type("name=link", "http://www.weibo.com");
		Thread.sleep(3000);
		webtest.tapClick();
		webtest.enterclick();
		
	}
}
