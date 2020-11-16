package masterIL.example.RestSpringBoot.dao;

import masterIL.example.RestSpringBoot.model.Serie;

import java.util.List;

public interface ISerieDAO {

    public List<Serie> findAll();

    public Serie findByName(String name);

    public void addSerie(Serie serie);

    public void modifySerieByName(String name, Serie serie);

    public void deleteSerieByName(String name);

}
