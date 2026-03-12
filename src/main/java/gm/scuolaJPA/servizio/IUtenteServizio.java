package gm.scuolaJPA.servizio;

import gm.scuolaJPA.modelo.Utente;

import java.util.List;


public interface IUtenteServizio {
    public List<Utente> listUtente();
    public Utente searchUtentePerId(Integer idUtente);
    public void keepUtente(Utente utente);
    public void deleteUtente(Utente utente);
}
