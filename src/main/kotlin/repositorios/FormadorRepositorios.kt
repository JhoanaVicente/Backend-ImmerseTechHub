package repositorios

import domain.Formador


@Repositorio
interface FormadorRepositorio : JpaRepositorio<Formador, Long> {
    fun findByAddressContaining(location: String): List<Formador>
}

open class JpaRepositorio<T, U> {

}

annotation class Repositorio
