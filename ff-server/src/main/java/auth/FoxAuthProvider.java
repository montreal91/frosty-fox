package auth;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;


public class FoxAuthProvider implements AuthenticationProvider {
  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    if (isMtl(authentication)) {
      return grantMtl();
    }
    return null;
  }

  @Override
  public boolean supports(Class<?> authentication) {
    return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
  }

  private boolean isMtl(Authentication authentication) {
    return authentication.getCredentials().equals("mtl") && authentication.getPrincipal().equals("mtl");
  }

  private UsernamePasswordAuthenticationToken grantMtl() {
    return new UsernamePasswordAuthenticationToken(
        "mtl", "mtl", Collections.singleton(new SimpleGrantedAuthority("god"))
    );
  }
}
