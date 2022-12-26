package transport;

public class Car {
    private final String brand = null;
    private final String model;
    private String bodyColor;
    private double engineSize;
    private  final String countryOfOrigin;
    private final int yearOfManufacture;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean tires;

    public class key {
        boolean remoteEngineStart;
        public void done() {
            System.out.println("Автомобиль с удалённым запуском двигателя");
        }
        public void empty() {
            System.out.println("Удаленный запуск двигателя");
        }
        boolean keylessEntry;
        public void available() {
            System.out.println("Бесключевой доступ доступен");
        }
        public void notAvailable() {
            System.out.println("Бесключевой доступ отсутствует");
        }
    }
    public String brand1 = "Lada";
    public String model1 = "Grande";
    public String countryOfOrigin1 = "Россия";
    public String bodyColor1 = "жёлтый";
    public double engineSize1 = 1.7;
    public int yearOfManufacture1 = 2015;

    public String brand2 = "Audi";
    public String model2 = "A8 50 L TDI quattro";
    public String countryOfOrigin2 = "Германия";
    public String bodyColor2 = "чёрный";
    public double engineSize2 = 3.0;
    public int yearOfManufacture2 = 2020;

    public String brand3 = "BMW";
    public String model3 = "Z8";
    public int yearOfManufacture3 = 2021;

    public String brand4 = "Kia";
    public String model4 = "Sportage 4 поколение";
    public String countryOfOrigin4 = "Южная Корея";
    public String bodyColor4 = "красный";
    public double engineSize4 = 2.4;
    public int yearOfManufacture4 = 2018;

    public String brand5 = "Hyundai";
    public String model5 = "Avante";
    public String bodyColor5 = "оранжевый";
    public double engineSize5 = 1.6;
    public int yearOfManufacture5 = 2016;

    public Car(String model, String countryOfOrigin, int yearOfManufacture, String bodyType, int numberOfSeats) {
        this.model = model;
        this.countryOfOrigin = countryOfOrigin;
        this.yearOfManufacture = yearOfManufacture;
        this.bodyType = bodyType;
        this.numberOfSeats = numberOfSeats;
    }


    public String getBrand() {
        return brand;
    }



    public String getModel() {
        return model;
    }


    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
}
//ДЗ завершено
