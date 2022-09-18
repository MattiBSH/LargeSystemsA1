package dtos;

import java.io.Serializable;
import java.util.Objects;

public class UserDto implements Serializable {
    private final Long id;
    private final String username;
    private final String email;
    private final String password;
    private final String registeredSince;
    private final int accountNumber;

    public UserDto(Long id, String username, String email, String password, String registeredSince, int accountNumber) {
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

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRegisteredSince() {
        return registeredSince;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto entity = (UserDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.username, entity.username) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.password, entity.password) &&
                Objects.equals(this.registeredSince, entity.registeredSince) &&
                Objects.equals(this.accountNumber, entity.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, password, registeredSince, accountNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "username = " + username + ", " +
                "email = " + email + ", " +
                "password = " + password + ", " +
                "registeredSince = " + registeredSince + ", " +
                "accountNumber = " + accountNumber + ")";
    }
}
