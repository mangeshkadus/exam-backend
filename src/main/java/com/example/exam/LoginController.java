package com.example.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/login")
    public ResponseEntity<User> login(@RequestBody User loginUser) {
        // Retrieve user from database based on username
        User user = userRepository.findByUsername(loginUser.getUsername());

        // Check if user exists and password matches
        if (user != null && user.getPassword().equals(loginUser.getPassword())) {
            // Construct UserDetailsDTO with user details
            User userDetailsDTO = new User(user.getFullName(), user.getEmail(), user.getPhone());
            return ResponseEntity.ok(userDetailsDTO);
        } else if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }
    
    

}
