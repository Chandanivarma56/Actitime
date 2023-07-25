package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.GenericLibrary.ListenerImplementation;
import com.Actitime.ObjectRepository.HomePage;
import com.Actitime.ObjectRepository.TaskPage;
@Listeners(ListenerImplementation.class)
public class CreateCustomer extends Baseclass {
@Test
public void createCustomer() throws EncryptedDocumentException, IOException {
    HomePage hp=new HomePage(driver);
			hp.getTasktab().click();
			TaskPage tp=new TaskPage(driver);
			tp.getAddnewbtn().click();
			tp.getNewcust().click();
			FileLibrary f=new FileLibrary();
			String name = f.readDataFromExcel("Sheet1", 1, 1);
			tp.getCustname().sendKeys(name);
             String desp = f.readDataFromExcel("Sheet1", 1, 2);
             tp.getCustdesp().sendKeys(desp);
             tp.getCreatecust().click();
			
}
}
