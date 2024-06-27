package com.tontonX.Spring3Mvc.resources;

import com.tontonX.Spring3Mvc.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
   @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1l,"Maria","1233444","995855","jopa@hotmail.com");
        return ResponseEntity.ok().body(u);
    }

}
