package gm.scuolaJPA.servizio;

import gm.scuolaJPA.modelo.Utente;
import gm.scuolaJPA.repositorio.UtenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class utenteServizio implements IUtenteServizio{

    @Autowired
    private UtenteRepositorio utenteRepositorio;
    @Override
    public List<Utente> listUtente() {
        List<Utente>utentes= utenteRepositorio.findAll();
        return utentes;
    }

    @Override
    public Utente searchUtentePerId(Integer idUtente) {
        Utente utente = utenteRepositorio.findById(idUtente).orElse(null);
        return utente;
    }

    @Override
    public void keepUtente(Utente utente) {
        utenteRepositorio.save(utente);

    }

    @Override
    public void deleteUtente(Utente utente) {
         utenteRepositorio.delete(utente);
    }
}
