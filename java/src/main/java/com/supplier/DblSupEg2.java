package com.supplier;
/*
 * created @ Mon Jul 05 2021 3:46:49 pm
 * ref @ https://www.concretepage.com/java/java-8/java-doublesupplier
 */

import java.util.Random;
import java.util.function.DoubleSupplier;

public class DblSupEg2 {
    public static void main(String[] args) {

        // ##########################################################################################
        DoubleSupplier randomDs = () -> new Random().nextDouble();
        System.out.println(randomDs.getAsDouble());

        // ##########################################################################################
        DoubleSupplier ds = () -> Double.parseDouble("123.0987");
        System.out.println(ds.getAsDouble());

        // ##########################################################################################
        DoubleSupplier multipleDs = () -> {
            double v1 = 30.23;
            double v2 = 45.97;
            return v1 * v2;
        };
        System.out.println(multipleDs.getAsDouble());

        // ##########################################################################################
        DoubleSupplier d2 = new Random()::nextDouble;
        System.out.println("new Random()::nextDouble = " + d2.getAsDouble());

        // ##########################################################################################
        DoubleSupplier traj = AppUti::getTrajectory;
        System.out.println("AppUti::getTrajectory = " + traj.getAsDouble());
    }
}

class AppUti {
    public static double getTrajectory() {
        return 543.15785;
    }
}
