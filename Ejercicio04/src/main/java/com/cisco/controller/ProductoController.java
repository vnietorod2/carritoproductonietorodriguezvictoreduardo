package com.cisco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.entity.Producto;
import com.cisco.service.ProductoService;

@RestController
@RequestMapping("/rest/producto")
public class ProductoController {
	
	@Autowired
	private ProductoService service;
	
	@GetMapping
	public ResponseEntity<List<Producto>> listaProducto(){
		return ResponseEntity.ok(service.listaProducto());
	
	}
	
	@PostMapping
	public ResponseEntity<Producto> registrarProducto(@RequestBody Producto obj){
		return ResponseEntity.ok(service.insertaActualizaProducto(obj));
	}
	
}
