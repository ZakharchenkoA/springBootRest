package ru.netology.springbootrest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springbootrest.model.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("Andrey") && password.equals("andrey")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("Oleg") && password.equals("oleg")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("Ivan") && password.equals("ivan")) {
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;
    }
}
