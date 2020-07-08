package com.enums.demo2;

public class Device {

    Config_API configApi;
    Api2 api2;

    public Device() {
	System.out.println("Inside Device() constructor");

	configApi = new Config_API();
	configApi.conenct();

	api2 = new Api2();
	api2.conenct();
    }

}
