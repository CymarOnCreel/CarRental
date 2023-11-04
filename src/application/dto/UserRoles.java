package application.dto;

import javax.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRoles {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

	public UserRoles(User user, Role role) {
		super();
		this.user = user;
		this.role = role;
	}

	public UserRoles() {
		super();
	}

	public User getUser() {
		return user;
	}

	public Role getRole() {
		return role;
	}

}
