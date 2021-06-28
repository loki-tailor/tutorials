package com.logics.t4;

import java.util.ArrayList;
import java.util.List;

public class _56_Tst {
    public static void main(String[] args) {

        List<String> traffic_lights = new ArrayList<>();

        traffic_lights.add(1, "RED");

        traffic_lights.add(2, "ORANGE");

        traffic_lights.add(3, "GREEN");

        traffic_lights.remove(new Integer(2));

        System.out.println(traffic_lights);
    }
}

/*-
Explanation
There is no element at index 0 so call to add element at index 1, "trafficLight.add(1, "RED");" throws an instance of java.lang.IndexOutOfBoundsException. 



trafficLight.remove(new Integer(2)); matches with trafficLight.remove(Object) and hence no compilation error.
*/
