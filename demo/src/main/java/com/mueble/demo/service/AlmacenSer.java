package com.mueble.demo.service;

import com.mueble.demo.entity.Almacen;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AlmacenSer {
    public Almacen actualizar(Almacen almacen);
    public Almacen registrar(Almacen almacen);
    public void eliminar(Almacen almacen);
    public List<Almacen>ver();
}
