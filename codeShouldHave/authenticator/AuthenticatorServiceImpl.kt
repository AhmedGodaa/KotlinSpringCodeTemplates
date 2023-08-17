package banquemisr.com.irrigationsystem.usecases.authenticator
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Service

@Service
class AuthenticatorServiceImpl : AuthenticatorService {
    override fun authenticate() {
        val authentication = SecurityContextHolder.getContext().authentication
        authentication.takeIf { it != null } ?: throw AuthenticationException("User Not Authenticated")
        authentication.isAuthenticated.takeIf { it } ?: throw IllegalArgumentException("User Not Authenticated")
    }
}

