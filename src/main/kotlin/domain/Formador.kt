package domain

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Lob
import jakarta.persistence.Table

annotation class Id

annotation class Entity

@Table(name = "formador")
@Entity
data class Formador(
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    var id: Long,
    @Lob
    var image: String,
    var name: String,
    val course: String,
)
