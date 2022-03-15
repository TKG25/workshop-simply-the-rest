package nl.han.oose.dea.rest.services.dto;

public class UserDTO {

    private String userName,password;

    public UserDTO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
