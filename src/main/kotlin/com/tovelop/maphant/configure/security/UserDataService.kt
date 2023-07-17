package com.tovelop.maphant.configure.security

import com.tovelop.maphant.dto.MockupUserDTO
import com.tovelop.maphant.dto.UserDTO
import org.springframework.context.annotation.Configuration
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import java.time.LocalDate

@Configuration
class UserDataService: UserDetailsService {
    override fun loadUserByUsername(username: String?): UserData {
        if(username == "test@test.com")
            return UserData(
                "test@test.com",
                "1234",
                MockupUserDTO("test@test.com", "1234", "test"),
            )

        throw UsernameNotFoundException("Not found")
    }
}