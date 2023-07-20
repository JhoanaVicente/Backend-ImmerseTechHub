package controllers

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
class UsuarioController (private val usuarioRepository: UsuarioRepository) {
    @GetMapping("/api/")
}