package domain

import jakarta.persistence.*


@Table(name = "formadores")
@Entity
data class Formador(
    var image: String,
    var name: String,
    val course: String,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,
)