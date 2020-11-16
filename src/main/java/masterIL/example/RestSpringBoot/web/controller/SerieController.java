package masterIL.example.RestSpringBoot.web.controller;

import masterIL.example.RestSpringBoot.dao.ISerieDAO;
import masterIL.example.RestSpringBoot.model.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SerieController {

    @Autowired
    private ISerieDAO dao;

    @GetMapping(value = "/Series")
    public List<Serie> getListeSeries(){
        return dao.findAll();
    }

    @GetMapping(value = "/Serie/{name}")
    public Serie getSerieByName(@PathVariable String name){
        return dao.findByName(name);
    }

    @PostMapping(value = "addSerie")
    public void addSerie(@RequestBody Serie serie){
        dao.addSerie(serie);
    }

    @PutMapping(value = "modifySerie/{name}")
    public void modifiySerie(@PathVariable String name, @RequestBody Serie serie){ dao.modifySerieByName(name, serie);}

    @DeleteMapping(value = "deleteSerie/{name}")
    public void deleteSerieByName(@PathVariable String name){ dao.deleteSerieByName(name);}

}
