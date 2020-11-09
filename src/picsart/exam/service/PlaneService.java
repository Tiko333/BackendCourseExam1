package picsart.exam.service;

import picsart.exam.model.Plane;

import java.util.Scanner;

public class PlaneService {
    public Plane create() {
        Plane plane = new Plane();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of the plane: ");
        String model = scanner.next();
        while (model.equals("")) {
            System.out.println("Name of the plane have not to be blank: ");
            model = scanner.next();
        }

        System.out.println("Enter country the plane belongs to" );
        String country = scanner.next();
        while (model.equals("")) {
            System.out.println("Country of the plane have not to be blank: ");
            model = scanner.next();
        }

        System.out.println("Enter year of publishing: ");
        int year = scanner.nextInt();
        while (year < 1903 || year > 2020) {
            System.out.println("Year must be from 1903 to 2020: ");
            year = scanner.nextInt();
        }

        System.out.println("Enter hours in air: ");
        int hours = scanner.nextInt();
        while (hours < 0 || hours > 10000) {
            System.out.println("Hours in air must be from 0 to 10000: ");
            hours = scanner.nextInt();
        }

        System.out.println("Enter is military or not: yes or no: ");
        String military = scanner.next();
        boolean isMilitary = false;
        if (military.equals("yes")) {
            isMilitary = true;
        }

        System.out.println("Enter type of engine: ");
        String engineType = scanner.next();

        System.out.println("Enter weight of plane: ");
        int weight = scanner.nextInt();
        while (weight < 1000 || weight > 160000) {
            System.out.println("Weight of plane must be from 1000 KG to 160000 KG: ");
            weight = scanner.nextInt();
        }

        System.out.println("Enter the maximum extent across the wings of an aircraft: ");
        int wingspan = scanner.nextInt();
        while (wingspan < 10 || wingspan > 45) {
            System.out.println("Maximum extent across the wings of an aircraft must be from 10 - 45: ");
            wingspan = scanner.nextInt();
        }

        System.out.println("Enter maximal speed per hour: ");
        int topSpeed = scanner.nextInt();
        while (topSpeed < 0) {
            System.out.println("Maximal speed per hour must be any not negative value: ");
            topSpeed = scanner.nextInt();
        }

        System.out.println("Enter number of seats: ");
        int seats = scanner.nextInt();
        while (seats < 0) {
            System.out.println("Number of seats must be any not negative value: ");
            seats = scanner.nextInt();
        }

        System.out.println("Enter cost of the plane: ");
        double cost = scanner.nextDouble();
        while (cost < 0) {
            System.out.println("Cost of the plane must be any not negative value: ");
            cost = scanner.nextDouble();
        }

        plane.setModel(model);
        plane.setCountry(country);
        plane.setYear(year);
        plane.setHours(hours);
        plane.setMilitary(isMilitary);
        plane.setEngineType(engineType);
        plane.setWeight(weight);
        plane.setWingspan(wingspan);
        plane.setTopSpeed(topSpeed);
        plane.setSeats(seats);
        plane.setCost(cost);

        return plane;
    }

    public Plane[] createPlanes(int size) {
        Plane[] planes = new Plane[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Creating plane number: " + (i + 1));
            planes[i] = create();
        }

        return planes;
    }

    public void coastAndTopSpeedOfMilitaryOrModelAndCountry(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println("Coast is: " + plane.getCost() + " top speed is: " + plane.getTopSpeed());
        }
        System.out.println("Model is: " + plane.getModel() + " country is: " + plane.getCountry());
    }

    public Plane newerPlane(Plane firstPlane, Plane secondPlane) {
        if (secondPlane.getYear() > firstPlane.getYear()) {
            return secondPlane;
        }
        return secondPlane;
    }

    public String biggerWingspan(Plane firstPlane, Plane secondPlane) {
        if (firstPlane.getWingspan() > secondPlane.getWingspan()) {
            return firstPlane.getModel();
        }

        return secondPlane.getModel();
    }

    public Plane biggestCoast(Plane firstPlane, Plane secondPlane) {
        if (secondPlane.getCost() > secondPlane.getCost()) {
            return secondPlane;
        }

        return firstPlane;
    }

    public void countryOfPlaneWithSmallestSeatsCount(Plane firstPlane, Plane secondPlane) {
        if (secondPlane.getSeats() < firstPlane.getSeats()) {
            System.out.println("Country of the plane with smallest seats count is: " + secondPlane.getCountry());
        }
        System.out.println("Country of the plane with smallest seats count is: " + firstPlane.getCountry());
    }

    public void printAllNotMilitaryPlanes(Plane[] planes) {
        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                plane.printInfo();
            }
        }
    }

    public void printAllMilitaryWithAirHoursMore100(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.isMilitary() && plane.getHours() > 100) {
                plane.printInfo();
            }
        }
    }

    public Plane planeWithMinimalWeight(Plane[] planes) {
        Plane minWeightPlane = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() <= minWeightPlane.getWeight()) {
                minWeightPlane = planes[i];
            }
        }

        return minWeightPlane;
    }

    public Plane militaryMinimalCoastPlane(Plane[] planes) {
        Plane minCoastPlane = planes[0];
        for (int i = 0; i < planes.length; i++) {
           if (planes[i].isMilitary()) {
               minCoastPlane = planes[i];
               for (int j = i + 1; j < planes.length; j++) {
                   if (planes[j].isMilitary()) {
                       if (planes[j].getCost() <= minCoastPlane.getCost()) {
                           minCoastPlane = planes[j];
                       }
                   }
               }
           }
           break;
        }

        return minCoastPlane;
    }

    public void printPlanesInAscendingOrder(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            for (int j = 1; j < planes.length - i; j++) {
                if (planes[j - 1].getYear() > planes[j].getYear()) {
                    Plane tmp = planes[j];
                    planes[j] = planes[j - 1];
                    planes[j - 1] = tmp;
                }
            }
        }
        for (Plane plane: planes) {
            plane.printInfo();
        }
    }

    public void printNotMilitaryPlanesInDescendingOrder(Plane[] planes) {
        int notMilitaryCount = 0;
        for (int i = 0; i < planes.length; i++) {
            if (!planes[i].isMilitary()) {
                notMilitaryCount++;
            }
        }
        Plane[] notMilitaryPlanes = new Plane[notMilitaryCount];
        for (int i = 0; i < planes.length; i++) {
            if (!planes[i].isMilitary()){
                notMilitaryPlanes[i] = planes[i];
            }
        }

        for (int i = 0; i < notMilitaryPlanes.length; i++) {
            for (int j = 1; j < notMilitaryPlanes.length - i; j++) {
                if (planes[j - 1].getSeats() < planes[j].getSeats()) {
                    Plane tmp = planes[j];
                    planes[j] = planes[j - 1];
                    planes[j - 1] = tmp;
                }
            }
        }
        for (Plane plane: notMilitaryPlanes) {
            plane.printInfo();
        }
    }

}
