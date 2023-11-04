package application.dto;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int carId;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @Column(name = "type")
    private String type;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @Column(name = "passenger_seats")
    private int passengerSeats;

    @ManyToOne
    @JoinColumn(name = "fuel_type_id")
    private FuelType fuelType;

    @Column(name = "price_per_day")
    private BigDecimal pricePerDay;

    @Column(name = "is_available")
    private boolean isAvailable;

	public Car(int carId, Brand brand, String type, Color color, int passengerSeats, FuelType fuelType,
			BigDecimal pricePerDay, boolean isAvailable) {
		super();
		this.carId = carId;
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.passengerSeats = passengerSeats;
		this.fuelType = fuelType;
		this.pricePerDay = pricePerDay;
		this.isAvailable = isAvailable;
	}

	public Car() {
		super();
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getPassengerSeats() {
		return passengerSeats;
	}

	public void setPassengerSeats(int passengerSeats) {
		this.passengerSeats = passengerSeats;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public BigDecimal getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(BigDecimal pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getCarId() {
		return carId;
	}
    
    

}
