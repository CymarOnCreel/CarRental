package application.dto;

import javax.persistence.*;

@Entity
@Table(name = "delivery_address")
public class DeliveryAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "delivery_zipcode")
    private String deliveryZipcode;

    @Column(name = "delivery_city")
    private String deliveryCity;

    @Column(name = "delivery_state")
    private String deliveryState;

    @Column(name = "delivery_address")
    private String deliveryAddress;

	public DeliveryAddress(int addressId, User user, String deliveryZipcode, String deliveryCity, String deliveryState,
			String deliveryAddress) {
		super();
		this.addressId = addressId;
		this.user = user;
		this.deliveryZipcode = deliveryZipcode;
		this.deliveryCity = deliveryCity;
		this.deliveryState = deliveryState;
		this.deliveryAddress = deliveryAddress;
	}

	public DeliveryAddress() {
		super();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDeliveryZipcode() {
		return deliveryZipcode;
	}

	public void setDeliveryZipcode(String deliveryZipcode) {
		this.deliveryZipcode = deliveryZipcode;
	}

	public String getDeliveryCity() {
		return deliveryCity;
	}

	public void setDeliveryCity(String deliveryCity) {
		this.deliveryCity = deliveryCity;
	}

	public String getDeliveryState() {
		return deliveryState;
	}

	public void setDeliveryState(String deliveryState) {
		this.deliveryState = deliveryState;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public int getAddressId() {
		return addressId;
	}
    
    

}
