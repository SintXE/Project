package com.mueble.demo.service;

import com.mueble.demo.entity.Almacen;
import com.mueble.demo.repository.AlmacenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlmacenImpl implements AlmacenSer{
    @Autowired
    private AlmacenRepo almacenRepo;

    @Override
    public Almacen actualizar(Almacen almacen) {

        return almacenRepo.save(almacen);
    }

    @Override
    public Almacen registrar(Almacen almacen) {
        return almacenRepo.save(almacen);
    }

    @Override
    public void eliminar(Almacen almacen) {
        almacenRepo.delete(almacen);
    }

    @Override
    public List<Almacen> ver() {

        return almacenRepo.findAll();
    }
}
