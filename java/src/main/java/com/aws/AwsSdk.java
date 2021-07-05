package com.aws;

public class AwsSdk {
    /*-
    
    public static void main(String[] args) throws Exception {
    
    	long start = System.nanoTime();
    	System.out.println("START\n");
    
    	final AmazonEC2 ec2 = AmazonEC2ClientBuilder.defaultClient();
    	DescribeInstancesRequest request = new DescribeInstancesRequest();
    
    	// Filter filter = new Filter("tag:key1");
    	// filter.withValues("value1");
    
    	Filter filter = new Filter("tag:spotinst:aws:ec2:group:name");
    	filter.withValues("sp-api.appbazaar.com");
    	request.withFilters(filter);
    
    	DescribeInstancesResult response = ec2.describeInstances(request);
    	System.out.println(request);
    	System.out.println();
    	System.out.println(response);
    	long diff = System.nanoTime() - start;
    	System.out.println("\nEND\n");
    	System.out.println("TOTAL TIME = " + TimeUnit.NANOSECONDS.toSeconds(diff));
    
    	for (Reservation reservation : response.getReservations()) {
    		for (Instance instance : reservation.getInstances()) {
    			System.out.println();
    			System.out.println("Public IP = " + instance.getPublicIpAddress());
    			System.out.println("Private IP = " + instance.getPrivateIpAddress());
    			System.out.println();
    		}
    	}
    
    }
    
    public static void old(String[] args) {
    
    	final AmazonEC2 ec2 = AmazonEC2ClientBuilder.defaultClient();
    	boolean done = false;
    
    	DescribeInstancesRequest request = new DescribeInstancesRequest();
    
    	while (!done) {
    		DescribeInstancesResult response = ec2.describeInstances(request);
    
    		for (Reservation reservation : response.getReservations()) {
    			for (Instance instance : reservation.getInstances()) {
    				System.out.printf(
    						"Found instance with id %s, " + "AMI %s, " + "type %s, " + "state %s "
    								+ "and monitoring state %s",
    						instance.getInstanceId(), instance.getImageId(), instance.getInstanceType(),
    						instance.getState().getName(), instance.getMonitoring().getState());
    			}
    		}
    
    		request.setNextToken(response.getNextToken());
    
    		if (response.getNextToken() == null) {
    			done = true;
    		}
    	}
    
    }
    */
}
