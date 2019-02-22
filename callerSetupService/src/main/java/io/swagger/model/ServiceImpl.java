package io.swagger.model;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

import javax.sql.DataSource;

import org.springframework.context.support.StaticApplicationContext;

import oracle.jdbc.pool.OracleDataSource;
import io.swagger.model.CallerSetupResponse;*/
public class ServiceImpl {/*
	public static DataSource getOracleDataSource()
	{
		OracleDataSource oracleDS = null;
		System.out.println("Inside ");
		try 
		{
			Logger logger=Logger.getLogger(ServiceImpl.class);
			oracleDS = new OracleDataSource();
			oracleDS.setURL("jdbc:oracle:thin:@10.151.35.12:1521:mipdb01");
			oracleDS.setUser("mi");
			oracleDS.setPassword("mi");
			logger.info("object" +oracleDS);
		} 
		catch (Exception e) 
		{

			e.printStackTrace();
		} 
		return oracleDS;
	}
	public static CallerSetupResponse getResponse(String mobileNo)
	{
		Logger logger=Logger.getLogger(ServiceImpl.class);
		logger.info("mobileNo="+mobileNo);
		CallerSetupResponse response=new CallerSetupResponse();
		Connection connection = null;
		ResultSet rs = null;
		Statement smt = null;

		try
		{
			
			String result=null;
			String  strDate=null;
			DataSource ds = ServiceImpl.getOracleDataSource();
			
			//System.out.println("Inside service..."+clientId);
			String query = "select polcy_nbr, PH_BRTH_DT from client_mstr where polcy_nbr in (select POLICY_NUMBER from VPOLICYONLINE where PH_MOBILE_NBR='"+mobileNo.trim()+"')";
			List<PolicyLst> policyLst=new ArrayList<PolicyLst>();
			try
			{
				connection = ds.getConnection();	
				if(connection!=null)
				{
				System.out.println("connection"+connection);
				smt = connection.createStatement();
				connection.setAutoCommit(false);

				rs = smt.executeQuery(query);
				System.out.println("query ="+query);
				
				if(rs != null)
				{
					 int rowCount = 0;
			        
			           //System.out.println("Total number of rows in ResultSet object = "+rowCount);

					while(rs.next())
					{
						System.out.println("rs value"+rs);
						PolicyLst pList=new PolicyLst();
						pList.setPolicyNo(rs.getString("polcy_nbr"));
						Date dobReceived=rs.getDate("PH_BRTH_DT");
						DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
						
						//to convert Date to String, use format method of SimpleDateFormat class.
						System.out.println("dobReceived"+dobReceived);
						if(dobReceived!=null && !dobReceived.equals(""))
						 strDate = dateFormat.format(rs.getDate("PH_BRTH_DT"));
						pList.setDob(strDate);
						//result=rs.getString(1);
						//phBirthdate=rs.getString(2);
						System.out.println("Result from OracleDB"+rs.getString("polcy_nbr")+"####"+strDate);
						policyLst.add(pList);
						rowCount++;
						
					}
					if(policyLst!=null && policyLst.size()>0)
					{
					response.setStatus("sucess");
					response.setPolicies(Integer.toString(rowCount));
					response.setPolicyLst(policyLst);
					response.setFinalMessage("Success");
					}
					else
					{
						response.setStatus("fail");
						response.setPolicies(Integer.toString(rowCount));
						response.setPolicyLst(policyLst);
						response.setFinalMessage("Fail");
					}
				}
				else
				{
					
					response.setStatus("Fail");
					response.setPolicies("0");
					response.setPolicyLst(policyLst);
					response.setFinalMessage("Fail");
					//response.setFinalMessage("NO DATA FOUND");
				}
				

				

				}
				else{
					response.setPolicies("null");
					response.setPolicyLst(null);
					response.setStatus("Fail");
					response.setFinalMessage("Provider Service down");
				}
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			} 
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
		finally{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return response;
	}

	private static String getValue(String txt)
	{
		if(txt == null || txt.equals(""))
		{
			return "";
		}
		else
		{
			return txt;
		}
	}*/
}


