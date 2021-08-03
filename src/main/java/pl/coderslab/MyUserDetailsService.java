package pl.coderslab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.coderslab.entity.User;
import pl.coderslab.repository.UserRepository;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;


    //returns instance of myuserdetails
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
        Optional<User> user = userRepository.findByUserName(userName);

        //the only labda in the message_web_page_sb project ¯\_(ツ)_/¯
        user.orElseThrow(() -> new UsernameNotFoundException("NOT FOUND: " + userName));

        return user.map(MyUserDetails::new).get();
    }
}
