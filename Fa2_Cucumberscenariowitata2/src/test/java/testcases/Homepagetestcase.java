package testcases;

import io.cucumber.java.en.And;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepagetestcase {
	@Given ("open browser as {string}")
	public void openbrowser(String data1){
		System.out.println("-----browser opened--------"+data1);
	}
	@ When ("enter url as {string}")
	public void enterurl(String data1){
		System.out.println("-------enter url completed--------"+data1);
	}
	@When ("enter user name as {string}")
	public void enterusername(String data1){
		//int i =1/0;
		System.out.println("--------enter username completed----------"+data1);
	}
	@And ("enter password as {string}")
	public void enterpassword(String data1){
		System.out.println("---------enter password completed---------"+data1);
	}
	@But ("dont click remember checkbox")
	public void clickremember(){
		System.out.println("-------remember click event not performed---------");
	}
	@When ("click login button")
	public void clickloginbutton(){
		System.out.println("-----------click login button-----------");
	}
	@Then ("verify welcome page as {string}")
	public void verifywelcomepage(String data1){
		System.out.println("---------verify welcome page----------"+data1);
	}
}
