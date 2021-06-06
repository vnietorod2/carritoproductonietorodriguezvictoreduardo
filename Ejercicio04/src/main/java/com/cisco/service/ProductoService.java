package com.cisco.service;

import java.util.List;
import java.util.Optional;

import com.cisco.entity.Producto;

public interface ProductoService {

	public abstract List<Producto> listaProducto();
	public abstract Producto insertaActualizaProducto(Producto obj);
	public abstract Optional<Producto> obtienePorId(int idProducto);
	public abstract void eliminaProducto(int id);
	public abstract List<Producto> listaProductoPorNombreLike(String filtro);
	public abstract List<Producto> listaPorDescripcion(String descripcion);
	public abstract List<Producto> listaPorDescripcion(String descripcion, int idProducto);
	
}
