package com.aws;

public class AwsApacheIntereceptor {

    /*-    
    
    	public static void main(String[] args) throws IOException {
    
    		String url = "https://ec2.amazonaws.com?Action=DescribeInstances";
    
    		String serviceName = "ec2";
    		String AWS_REGION = "us-east-1";
    
    		HttpClientBuilder builder = HttpClientBuilder.create();
    
    		AWS4Signer signer = new AWS4Signer();
    		signer.setServiceName(serviceName);
    		signer.setRegionName(AWS_REGION);
    
    		HttpRequestInterceptor interceptor = new AWSRequestSigningApacheInterceptor(serviceName, signer,
    				new DefaultAWSCredentialsProviderChain());
    
    		builder.addInterceptorLast(interceptor).build();
    
    		try (CloseableHttpClient httpClient = builder.build()) {
    			HttpGet getRequest = new HttpGet(url);
    
    			// Set the API media type in http accept header
    			getRequest.addHeader("accept", "application/xml");
    
    			CloseableHttpResponse response = httpClient.execute(getRequest);
    			System.out.println(response);
    			System.out.println(response.getStatusLine());
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    
    	}
    */
}
