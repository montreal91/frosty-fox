package auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public class JwtUserDetailService implements UserDetailsService {
  public UserDetails loadUserByUsername(String username) {
    if (username.equals("mtl")) {
      return getMtl();
    }
    return null;
  }

  public UserDetails getMtl() {
    return new AccountDetails("mtl", "mtl");
  }
}
