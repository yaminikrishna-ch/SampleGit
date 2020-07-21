package com.klu;
import java.util.*;
import org.apache.log4j.Logger;
import java.util.logging.Formatter;
import java.util.logging.*;


public  class EpamAssignment extends Formatter {
	public static Logger logger = Logger.getLogger(EpamAssignment.class.getName());
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		logger.info("Enter the principle amount");
		double principle = sc.nextDouble();
		logger.info("Enter the Number of years");
		logger.info("\n");
		double noOfYears = sc.nextDouble();
		logger.info("Enter the Rate Of Interest");
		double rateOfInterest = sc.nextDouble();
			double compoundinterest=Math.pow((1+(rateOfInterest/100)), noOfYears);
			double compound=compoundinterest*principle;
			logger.info(""+compound);
			double simpleinterest=(principle*rateOfInterest*noOfYears)/100;
			logger.info(""+simpleinterest);
//		logger.debug("This is Krishna's debug message");
//		logger.info("This is the information given by krishna");
	}
	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		return null;
	}
}
