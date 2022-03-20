package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class Helloworld {

    @GET
    public String Helloworld(){
        return "Hello world";
    }
}
