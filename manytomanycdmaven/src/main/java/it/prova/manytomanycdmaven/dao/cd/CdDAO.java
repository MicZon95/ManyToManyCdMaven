package it.prova.manytomanycdmaven.dao.cd;

import it.prova.manytomanycdmaven.dao.IBaseDAO;
import it.prova.manytomanycdmaven.model.Cd;
import it.prova.manytomanycdmaven.model.Genere;

import java.util.List;

public interface CdDAO extends IBaseDAO<Cd>{

    public List<Cd> findAllByRuolo(Genere genereInput);
}
