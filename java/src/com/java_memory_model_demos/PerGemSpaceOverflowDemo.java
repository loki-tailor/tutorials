package com.java_memory_model_demos;

/*-
	@created 14-07-20

	ref: https://www.javainuse.com/java/permgen
*/

public class PerGemSpaceOverflowDemo {
	static int i = 0;
	public static void main(String[] args) {
		if(i < 2500) {
			i++;
			System.out.println(i);
			main(new String[] {(args[0] + args[0]).intern()} );
		}
	}
}

/*-

------------------------------------------------------------------------------------------------------------------------------

cmd command to run:

java -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:./com/java_memory_model_demos/PerGemSpaceOverflowDemo_gc.log com.java_memory_model_demos.PerGemSpaceOverflowDemo demo

------------------------------------------------------------------------------------------------------------------------------

OUTPUT:

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOfRange(Arrays.java:3664)
	at java.lang.String.<init>(String.java:207)
	at java.lang.StringBuilder.toString(StringBuilder.java:407)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)
	at com.java_memory_model_demos.PerGemSpaceOverflowDemo.main(PerGemSpaceOverflowDemo.java:15)


*/
