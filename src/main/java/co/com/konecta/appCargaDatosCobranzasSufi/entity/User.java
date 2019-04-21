package co.com.konecta.appCargaDatosCobranzasSufi.entity;

public class User extends DateAudit {
    
    private int id;
    private String name;
    private String username;
    private String password;
	private String token;

    public User() {

    }

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
    
 
}
