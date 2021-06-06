package com.cisco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.entity.Producto;
import com.cisco.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;

	@Override
	public List<Producto> listaProducto() {
		return repository.findAll();
	}

	@Override
	public Producto insertaActualizaProducto(Producto obj) {
		return repository.save(obj);
	}

	@Override
	public void eliminaProducto(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<Producto> listaProductoPorNombreLike(String filtro) {
			return repository.listaProductoPorNombreLike(filtro);
	}

	@Override
	public Optional<Producto> obtienePorId(int idProducto) {
		return repository.findById(idProducto);
	}

	@Override
	public List<Producto> listaPorDescripcion(String descripcion) {
		return repository.findByDescripcion(descripcion);
	}

	@Override
	public List<Producto> listaPorDescripcion(String descripcion, int idProducto) {
		return repository.findByDescripcionAndIdProductoNot(descripcion, idProducto);
	}

	

}
