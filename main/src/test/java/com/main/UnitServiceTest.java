package com.main;

import com.main.dtos.AuthResponse;
import com.main.models.User;
import com.main.repositories.UserRepository;
import com.main.security.JwtService;
import com.main.services.AuthService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import com.main.dtos.LoginRequest;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UnitServiceTest {
/*
    @Mock
    private AuthenticationManager authenticationManager;
    @Mock
    private UserRepository userRepository;

    @Mock
    private JwtService jwtService;

    @InjectMocks
    private AuthService authService;

    @Test
    void login_UsuarioYPasswordCorrectos_DevuelveToken() {
        LoginRequest request = new LoginRequest("sergio", "1234");

        User user = mock(User.class);
        when(authenticationManager.authenticate(any()))
                .thenReturn(new UsernamePasswordAuthenticationToken("sergio", "1234"));

        when(userRepository.findByUsername("sergio")).thenReturn(Optional.of(user));
        when(jwtService.getToken(user)).thenReturn("mocked-token");

        AuthResponse response = authService.login(request);

        assertEquals("mocked-token", response.getToken());
    }

    @Test
    void login_UsuarioNoExiste_LanzaException() {
        LoginRequest request = new LoginRequest("ghost", "1234");

        when(userRepository.findByUsername("ghost")).thenReturn(Optional.empty());

        assertThrows(NoSuchElementException.class, () -> authService.login(request));
    }
*/

}
