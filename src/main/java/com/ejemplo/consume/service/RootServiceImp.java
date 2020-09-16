package com.ejemplo.consume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.consume.entity.Root;
import com.ejemplo.consume.repository.RootRepository;
@Service
public class RootServiceImp implements RootService {
	@Autowired
	private RootRepository rootRepo;

	@Override
	@Transactional
	public Root save(Root root) {
		
		return rootRepo.save(root);
	}

}
