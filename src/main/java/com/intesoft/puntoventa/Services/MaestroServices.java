/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.intesoft.puntoventa.Services;

import com.intesoft.puntoventa.entity.Maestro;
import java.util.List;

/**
 *
 * @author alejo
 */
public interface MaestroServices {
    public List<Maestro> listarProductos();

    public Maestro getMaxCodigo();

    public void crearProducto(Maestro maestro);

    public void modificarProducto(Maestro maestro);

    public void deleteMaestro(int codigo);
}
