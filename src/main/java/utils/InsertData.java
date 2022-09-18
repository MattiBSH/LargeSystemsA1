package utils;

import dto.UserDTO;
import services.UserService;

import java.util.Date;

public class InsertData {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.createUser(new UserDTO(121212l,"Matti","matti@mail.com","Test1234",new Date().toString(),1233));
    }
}
