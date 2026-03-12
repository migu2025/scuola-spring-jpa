package gm.scuolaJPA.repositorio;

import gm.scuolaJPA.modelo.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepositorio extends JpaRepository<Utente,Integer> {
}
