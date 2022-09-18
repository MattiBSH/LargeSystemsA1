package controllers;
import dto.UserDTO;
import org.springframework.web.bind.annotation.*;
import services.UserService;
import java.util.Date;

@RestController
@RequestMapping("api/user")
public class UserController {
    @GetMapping("/")
    public String d() {
        return "Public Content.";
    }

        @GetMapping("/all")
        public String allAccess() {
            return "Public Content.";
        }

        @GetMapping("/user")
        public String userAccess() {
            return "User Content.";
        }
        @GetMapping("/mod")
        public String moderatorAccess() {
            return "Moderator Board.";
        }
        @GetMapping("/admin")
        public String adminAccess() {
            return "Admin Board.";
        }

        @PostMapping("/add")
        public String add() {
            UserService userService=new UserService();
            userService.createUser(new UserDTO(121212l,"Matti","matti@mail.com","Test1234",new Date().toString(),1233));
            return "Added";
        }

}
