package co.com.konecta.appCargaDatosCobranzasSufi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

import javax.persistence.Table;;

@Entity
@Table(name = "user_role", uniqueConstraints = @UniqueConstraint(columnNames = { "role", "username" }))
public class UserRole {

	@Id
	@GeneratedValue
	@Column(name="user_rol_id",unique = true, nullable = false)
	private Integer userRolId;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="user")
	@Column(name="username", nullable=false)
	private User user;
	
	@Column(name="role_name",nullable=false, length=45)
	private String roleName;
	
	@Column(name="name",nullable=false, length=45)
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserRole( User user, String roleName) {
		super();
		this.user = user;
		this.roleName = roleName;
	}
	
	public UserRole() {}

	
	public Integer getUserRolId() {
		return userRolId;
	}

	public void setUserRolId(Integer userRolId) {
		this.userRolId = userRolId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	} ;
	
	
	
}
