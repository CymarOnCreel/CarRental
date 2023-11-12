package application.dto;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rentals")
public class Rental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rental_id")
	private Long rentalId;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@ManyToOne
	@JoinColumn(name = "salesman_id", nullable = false)
	private User salesman;

	@ManyToOne
	@JoinColumn(name = "car_id", nullable = false)
	private Car car;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date", nullable = false)
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date", nullable = false)
	private Date endDate;

	public Rental() {
	}

	public Rental(User user, User salesman, Car car, Date startDate, Date endDate) {
		this.user = user;
		this.salesman = salesman;
		this.car = car;
		this.startDate = startDate;
		this.endDate = endDate;
	}

}
