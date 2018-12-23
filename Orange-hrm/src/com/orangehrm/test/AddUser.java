package com.orangehrm.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;

public class AddUser extends BaseSelenium {
   @Test public void verifyAddUser()
   {
	   
			WebElement clickadmin=DR.findElement(By.id("menu_admin_viewAdminModule"));
			clickadmin.click();
			WebElement clickaddbtn=DR.findElement(By.id("btnAdd"));
			clickaddbtn.click();
			WebElement userrole=DR.findElement(By.id("systemUser_userType"));
		    Select ur=new Select(userrole);    //dropdown
			ur.selectByVisibleText("Admin");
			WebElement empname=DR.findElement(By.id("systemUser_employeeName_empName"));
			empname.sendKeys("Ankur Kumar");
			WebElement username=DR.findElement(By.id("systemUser_userName"));
			username.sendKeys("ankur_04");
			WebElement password=DR.findElement(By.id("systemUser_password"));
			password.sendKeys("ankur_04");
			WebElement confirmedpassword=DR.findElement(By.id("systemUser_confirmPassword"));
			confirmedpassword.sendKeys("ankur_04");
			WebElement savebtn=DR.findElement(By.id("btnSave"));
			savebtn.click();
			System.out.println("User Added");

		}

	}

   }
}
