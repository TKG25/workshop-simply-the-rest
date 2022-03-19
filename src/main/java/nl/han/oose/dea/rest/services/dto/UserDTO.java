package nl.han.oose.dea.rest.services.dto;

public class UserDTO {

    private String user;
    private String password;

    public UserDTO() {
    }

    public UserDTO(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUserName() {
        return user;
    }

    public String getPassword() {
        return password;
    }

}
