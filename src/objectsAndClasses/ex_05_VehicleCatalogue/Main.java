package objectsAndClasses.ex_05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<VehicleCatalog> vehicleCatalogList = new ArrayList<>();

        String input = scanner.nextLine();

        while(!input.equals("End")) {

            String[] vehicleData = input.split("\\s+");

            VehicleCatalog vehicleCatalog = new VehicleCatalog(vehicleData[0],
                    vehicleData[1], vehicleData[2], Integer.parseInt(vehicleData[3]));

            vehicleCatalogList.add(vehicleCatalog);

            input = scanner.nextLine();
        }


        String vehicleModels = scanner.nextLine();

        while(!vehicleModels.equals("Close the Catalogue")) {

            for (VehicleCatalog vehicle: vehicleCatalogList) {

                if (vehicle.getModel().equals(vehicleModels)) {

                   if(vehicle.getTypeOfVehicle().equals("car")) {

                        System.out.printf("Type: Car%nModel: %s%nColor: %s%nHorsepower: %d%n",
                                vehicle.getModel(),
                                vehicle.getColor(), vehicle.getHorsePower());
                        break;

                    } else if(vehicle.getTypeOfVehicle().equals("truck"))   {

                        System.out.printf("Type: Truck%nModel: %s%nColor: %s%nHorsepower: %d%n",
                                vehicle.getModel(),
                                vehicle.getColor(), vehicle.getHorsePower());
                        break;
                    }
                }
            }
            vehicleModels = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n",
                averageCarHp(vehicleCatalogList) );

        System.out.printf("Trucks have average horsepower of: %.2f.%n",
                averageTruckHp(vehicleCatalogList));

    }

    public static double averageCarHp(List<VehicleCatalog> vehicle) {

        double carHpSum = 0;
        int carsCount = 0;

        for (VehicleCatalog car : vehicle) {

            if(car.getTypeOfVehicle().equals("car")) {
                carsCount++;
                carHpSum += car.getHorsePower();
            }
        }
        if (carHpSum == 0 || carsCount == 0) {
            return 0.00;
        } else {
            return carHpSum / carsCount;
        }

    }

    public static double averageTruckHp(List<VehicleCatalog> vehicle) {

        double truckHpSum = 0;
        int truckCount = 0;

        for (VehicleCatalog truck: vehicle) {

                if (truck.getTypeOfVehicle().equals("truck")) {
                    truckCount++;
                    truckHpSum += truck.getHorsePower();
                }
        }
        if (truckHpSum == 0 || truckCount == 0) {
            return 0.00;
        } else {
            return truckHpSum / truckCount;
        }
    }
}
