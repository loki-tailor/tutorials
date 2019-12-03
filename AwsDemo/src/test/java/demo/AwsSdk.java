package demo;

import java.util.concurrent.TimeUnit;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.DescribeInstancesRequest;
import com.amazonaws.services.ec2.model.DescribeInstancesResult;
import com.amazonaws.services.ec2.model.Filter;
import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.Reservation;

public class AwsSdk {

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

		int count = 0;
		for (Reservation reservation : response.getReservations()) {
			for (Instance instance : reservation.getInstances()) {

				if (instance.getPublicIpAddress() != null && instance.getPrivateIpAddress() != null) {

					System.out.println();
					System.out.println("Public IP = " + instance.getPublicIpAddress());
					System.out.println("Private IP = " + instance.getPrivateIpAddress());
					System.out.println();
					count++;
				}
			}
		}
		System.out.println("TOTAL # of IP's: " + count);

	}
}