package picsart.exam.main;

import picsart.exam.model.Plane;
import picsart.exam.service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService planeService = new PlaneService();

        System.out.println("---------------Create plane---------------");
        Plane plane = planeService.create();
        plane.printInfo();
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("---------------Create planes---------------");
        Plane[] planes = planeService.createPlanes(2);
        for (Plane p: planes) {
            p.printInfo();
        }
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Print coast And Top Speed Of Military Or Model And Country");
        planeService.coastAndTopSpeedOfMilitaryOrModelAndCountry(plane);
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("---------------Newer plane----------------");
        System.out.println("---------------Create plane1---------------");
        Plane plane1 = planeService.create();
        System.out.println("---------------Create plane2---------------");
        Plane plane2 = planeService.create();
        Plane newerPlane = planeService.newerPlane(plane1, plane2);
        System.out.println("Newer plane is: ");
        newerPlane.printInfo();
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("---------------Bigger wingspan----------------");
        System.out.println("---------------Create plane1---------------");
        Plane plane3 = planeService.create();
        System.out.println("---------------Create plane2---------------");
        Plane plane4 = planeService.create();
        System.out.println("Bigger wingspan is: " + planeService.biggerWingspan(plane3, plane4));
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("---------------Bigger coast----------------");
        System.out.println("---------------Create plane1---------------");
        Plane plane5 = planeService.create();
        System.out.println("---------------Create plane2---------------");
        Plane plane6 = planeService.create();
        Plane planeWithBiggestCoast = planeService.biggestCoast(plane5, plane6);
        System.out.println("Plane with the biggest coast: " );
        planeWithBiggestCoast.printInfo();
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("---------------Country of plane with smallest seats count----------------");
        System.out.println("---------------Create plane1---------------");
        Plane plane7 = planeService.create();
        System.out.println("---------------Create plane2---------------");
        Plane plane8 = planeService.create();
        planeService.countryOfPlaneWithSmallestSeatsCount(plane7, plane8);
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("---------------All not military planes----------------");
        System.out.println("---------------Create planes----------------");
        Plane[] planes1 = planeService.createPlanes(2);
        planeService.printAllNotMilitaryPlanes(planes1);
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("---------------All not military planes----------------");
        System.out.println("---------------Create planes----------------");
        Plane[] planes2 = planeService.createPlanes(2);
        planeService.printAllMilitaryWithAirHoursMore100(planes2);
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("---------------Plane with minimal weight----------------");
        System.out.println("---------------Create planes----------------");
        Plane[] planes3 = planeService.createPlanes(2);
        Plane planeWithMinimalWeight = planeService.planeWithMinimalWeight(planes3);
        System.out.println("Plane with minimal weight: ");
        planeWithMinimalWeight.printInfo();
        System.out.println("------------------------------------------");
        System.out.println();


        System.out.println("---------------Military minimal cast plane----------------");
        System.out.println("---------------Create planes----------------");
        Plane[] planes4 = planeService.createPlanes(2);
        Plane militaryMinimalCoastPlane = planeService.militaryMinimalCoastPlane(planes4);
        System.out.println("Military minimal coast plane: ");
        militaryMinimalCoastPlane.printInfo();
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("---------------Print planes in ascending----------------");
        System.out.println("---------------Create planes----------------");
        Plane[] planes5 = planeService.createPlanes(3);
        planeService.printPlanesInAscendingOrder(planes5);
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("---------------Print not military planes in descending----------------");
        System.out.println("---------------Create planes----------------");
        Plane[] planes6 = planeService.createPlanes(3);
        planeService.printNotMilitaryPlanesInDescendingOrder(planes6);
        System.out.println("------------------------------------------");
        System.out.println();

    }
}
