package masterIL.example.RestSpringBoot.dao;

import masterIL.example.RestSpringBoot.model.Serie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Repository
public class SerieDAO implements ISerieDAO {


    private List<Serie> listSeries = new ArrayList<Serie>(Arrays.asList(new Serie("Dylan in the round", "Dylan", "Bla bla"), new Serie("First", "David", "Bal bla 2")));

    @Override
    public List<Serie> findAll() {
        return listSeries;
    }

    @Override
    public Serie findByName(String name) {
        Serie res = null;
        Serie serie;
        Iterator<Serie> iterator = listSeries.iterator();
        boolean trouve = false;
        while(iterator.hasNext() && !trouve){
            serie = iterator.next();
            if(serie.getName().equals(name)){
                res = serie;
                trouve = true;
            }
        }
        return res;
    }

    @Override
    public void addSerie(Serie serie) {
        listSeries.add(serie);
    }

    @Override
    public void modifySerieByName(String name, Serie nouvelleSerie) {
        this.deleteSerieByName(name);
        listSeries.add(nouvelleSerie);
    }

    @Override
    public void deleteSerieByName(String name) {
        Serie serie;
        Iterator<Serie> iterator = listSeries.iterator();
        boolean trouve = false;
        while(iterator.hasNext() && !trouve){
            serie = iterator.next();
            if(serie.getName().equals(name)){
                iterator.remove();
                trouve = true;
            }
        }
    }
}
