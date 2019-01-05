package com.sunder.wedphts;

/**
 * Created by ATUL SUNDER on 05-01-2019.
 */
public class MainApp {

    public static void main(String args[]) {
        String type = "jhy";
        Coach coach = getCoach(type);
        System.out.print(coach.getDailyWorkOut());
    }

    private static TrackCoach getCoach(String type) {

        switch (type) {
            case "TrackCoach":
                return new TrackCoach();
            default:
                return null;
        }

    }
}
