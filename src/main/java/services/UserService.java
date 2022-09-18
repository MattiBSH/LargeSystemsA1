package services;

import dto.UserDTO;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import repositories.UserRepository;

@Service
@Configurable
public class UserService implements UserDetailsService{
    @Autowired
    UserRepository userRepository;
    @Override
    public String createUser(UserDTO userDTO) {
        User userToInsert = new User(userDTO.getId(),userDTO.getUsername(),userDTO.getEmail(),userDTO.getPassword(),userDTO.getRegisteredSince(),userDTO.getAccountNumber());
        userRepository.save(userToInsert);

        return "Created user"+ userDTO.getUsername();
    }
}
