package dto;

public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String registeredSince;
    private int accountNumber;

    public UserDTO(Long id, String username, String email, String password, String registeredSince, int accountNumber) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.registeredSince = registeredSince;
        this.accountNumber = accountNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegisteredSince() {
        return registeredSince;
    }

    public void setRegisteredSince(String registeredSince) {
        this.registeredSince = registeredSince;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
