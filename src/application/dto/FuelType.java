package application.dto;

import javax.persistence.*;

@Entity
@Table(name="fueltypes")
public class FuelType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fuel_type_id")
	private int fuelTypeId;
	
	@Column(name="fuel_type_name")
	private String fuelTypeName;

	public FuelType(int fuelTypeId, String fuelTypeName) {
		super();
		this.fuelTypeId = fuelTypeId;
		this.fuelTypeName = fuelTypeName;
	}

	public FuelType() {
		super();
	}

	public String getFuelTypeName() {
		return fuelTypeName;
	}

	public void setFuelTypeName(String fuelTypeName) {
		this.fuelTypeName = fuelTypeName;
	}

	public int getFuelTypeId() {
		return fuelTypeId;
	}

	@Override
	public String toString() {
		return "FuelType [fuelTypeId=" + fuelTypeId + ", fuelTypeName=" + fuelTypeName + "]";
	}
	
	
	
}
