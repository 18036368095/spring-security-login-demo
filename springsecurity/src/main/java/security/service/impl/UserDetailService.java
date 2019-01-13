package security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import security.domain.User;
import security.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.findUserByName("uzck");
        List<GrantedAuthority> list = new ArrayList<>();
        getRoles(user, list);
        System.out.println(user.getUserName());
        System.out.println(user.getRoles());
        org.springframework.security.core.userdetails.User authUser
                = new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), list);
        return authUser;
    }

    public void getRoles(User user, List<GrantedAuthority> list) {
        for (String role : user.getRoles().split(",")) {
            list.add(new SimpleGrantedAuthority("ROLE_" + role));
        }
    }
}
