package controllers

import domain.Formador
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import repositorios.FormadorRepositorios // Asegúrate de importar correctamente la interfaz

@RestController
@CrossOrigin
class FormadorController(private val formadorRepositorios: FormadorRepositorios) {

    @GetMapping("/api/formadores")
    fun allFormadores(): List<Formador> = formadorRepositorios.findAll()

    @PostMapping("/api/formadores")
    fun addFormador(@RequestBody formador: Formador): Formador {
        return formadorRepositorios.save(formador)
    }
}




