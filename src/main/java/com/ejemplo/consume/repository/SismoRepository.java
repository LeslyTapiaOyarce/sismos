package com.ejemplo.consume.repository;

import org.springframework.data.repository.CrudRepository;

import com.ejemplo.consume.entity.Sismo;

public interface SismoRepository extends CrudRepository<Sismo,Integer> {

}
