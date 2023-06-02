package com.mueble.demo.controller;

import com.mueble.demo.entity.Almacen;
import com.mueble.demo.service.AlmacenSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/almacen")
public class AlmacenCont {

    @Autowired
    private AlmacenSer almacenSer;

    @GetMapping
    public List<Almacen>ver(){
        return almacenSer.ver();
    }

    @PostMapping
    public Almacen actualizar(@RequestBody Almacen almacen){
        return almacenSer.actualizar(almacen);
    }
    @PutMapping
    public Almacen registar(@RequestBody Almacen almacen){
        return almacenSer.registrar(almacen);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Almacen almacen){
        almacenSer.eliminar(almacen);
    }
}
