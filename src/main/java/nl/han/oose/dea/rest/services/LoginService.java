package nl.han.oose.dea.rest.services;

import nl.han.oose.dea.rest.services.dto.UserDTO;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/login")

public class LoginService {

//    @GET
//    public String loginDummy() {
//        return "logged in";
//    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String loginDummy() {
        return "{\n" +
                "  \"token\":  \"1234-1234-1234\", \n" +
                "  \"user\":   \"Meron Brouwer\"\n" +
                "}";
    }

}
