package com.systemlogic.Security;

import javax.jws.WebMethod;
import javax.jws.WebService;
import weblogic.jws.Policies;
import weblogic.jws.Policy;

@WebService
@Policies({ @Policy(uri = "policy:Https-policy.xml") })
public class WeblogicSecurity {
	@WebMethod
	public String sayHai(String x)
	{  System.out.println(" in server "+x);
		return " hai "+x;
	}
}
