package com.india.aegonPartner.beans;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;


import io.swagger.model.CallerSetupResponse;

import io.swagger.model.ServiceImpl;
public class CallerSetupRequestProcessor implements Processor{
	public void process(Exchange exchange) throws Exception 
	{
	
		String mobileNo = exchange.getIn().getBody(String.class);

		Logger logger=Logger.getLogger(CallerSetupRequestProcessor.class);
				CallerSetupResponse response=null; //=ServiceImpl.getResponse(mobileNo);
        
		System.out.println("Response is::" +response);
		
		if((mobileNo)==null)
    	response.setFinalMessage("No Data found");
		exchange.setProperty("JsonRequest", mobileNo);
		exchange.getOut().setHeader(Exchange.CONTENT_TYPE, "application/json");
		exchange.getOut().setBody(response);
		logger.info("response" + response);
	
	}
}
