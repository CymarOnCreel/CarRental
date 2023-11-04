package application.dto;

import javax.persistence.*;

@Entity
@Table(name = "user_address")
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "invoice_zipcode")
    private String invoiceZipcode;

    @Column(name = "invoice_city")
    private String invoiceCity;

    @Column(name = "invoice_state")
    private String invoiceState;

    @Column(name = "invoice_address")
    private String invoiceAddress;

	public UserAddress() {
		super();
	}

	public UserAddress(int addressId, User user, String invoiceZipcode, String invoiceCity, String invoiceState,
			String invoiceAddress) {
		super();
		this.addressId = addressId;
		this.user = user;
		this.invoiceZipcode = invoiceZipcode;
		this.invoiceCity = invoiceCity;
		this.invoiceState = invoiceState;
		this.invoiceAddress = invoiceAddress;
	}

	public int getAddressId() {
		return addressId;
	}

	public User getUser() {
		return user;
	}

	public String getInvoiceZipcode() {
		return invoiceZipcode;
	}

	public String getInvoiceCity() {
		return invoiceCity;
	}

	public String getInvoiceState() {
		return invoiceState;
	}

	public String getInvoiceAddress() {
		return invoiceAddress;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setInvoiceZipcode(String invoiceZipcode) {
		this.invoiceZipcode = invoiceZipcode;
	}

	public void setInvoiceCity(String invoiceCity) {
		this.invoiceCity = invoiceCity;
	}

	public void setInvoiceState(String invoiceState) {
		this.invoiceState = invoiceState;
	}

	public void setInvoiceAddress(String invoiceAddress) {
		this.invoiceAddress = invoiceAddress;
	}


}
