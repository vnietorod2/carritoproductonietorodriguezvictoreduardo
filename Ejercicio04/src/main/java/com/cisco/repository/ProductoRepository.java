package com.cisco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cisco.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

	
	@Query("Select a from Producto a where nombres like :fil")
	public abstract List<Producto> listaProductoPorNombreLike(@Param("fil") String filtro);

	public abstract List<Producto> findByDescripcion(String descripcion);
	public abstract List<Producto> findByDescripcionAndIdProductoNot(String descripcion, int idProducto);
}
