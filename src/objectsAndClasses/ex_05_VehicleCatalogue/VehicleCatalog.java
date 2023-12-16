package objectsAndClasses.ex_05_VehicleCatalogue;

public class VehicleCatalog {

    private String typeOfVehicle;
    private String model;
    private String color;
    private int horsePower;

    public VehicleCatalog(String typeOfVehicle, String model, String color, int horsePower) {

        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getTypeOfVehicle() {
        return this.typeOfVehicle;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsePower() {
        return this.horsePower;
    }




}
