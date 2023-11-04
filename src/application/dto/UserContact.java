package application.dto;

import javax.persistence.*;

@Entity
@Table(name = "user_contacts")
public class UserContact {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

	    @Column(name = "first_name")
	    private String firstName;

	    @Column(name = "last_name")
	    private String lastName;

	    @Column(name = "phone_number")
	    private String phoneNumber;

	    @Column(name = "email")
	    private String email;

		public UserContact() {
	
		}

	

		public UserContact(User user, String firstName, String lastName, String phoneNumber, String email) {
			super();
			this.user = user;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.email = email;
		}



		public User getUser() {
			return user;
		}



		public void setUser(User user) {
			this.user = user;
		}



		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "UserContact [ firstName=" + firstName + ", lastName=" + lastName
					+ ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
		}
	    
}
