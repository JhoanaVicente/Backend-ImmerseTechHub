package repositorios

import domain.Formador
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FormadorRepositorios : JpaRepository<Formador, Long> {
    fun findByAddressContaining(location: String): List<Formador>
}
