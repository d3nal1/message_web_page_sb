package pl.coderslab;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import pl.coderslab.entity.User;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MyUserDetails implements UserDetails {

    //hardcoding example - might be reusable
    private String userName;
    private String password;
    private boolean active;
    private List<GrantedAuthority> authorities;

    //constructor - userdetails service returns userdetails object depending on username
    public MyUserDetails(User user){
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.active = user.isActive();
        this.authorities = Arrays.stream(user.getRoles().split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }
    //hardcoded, not to mess with it <yup I'm lazy boy>
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    //hardcoded, not to mess with it <hope this will not change my project mark>
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return active;
    }
    //hardcoded, not to mess with it <hope this will not change my project mark>
    @Override
    public boolean isEnabled() {
        return true;
    }
}
