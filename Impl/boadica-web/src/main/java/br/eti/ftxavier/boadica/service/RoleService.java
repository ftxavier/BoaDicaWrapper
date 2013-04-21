package br.eti.ftxavier.boadica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.eti.ftxavier.boadica.dao.RoleDao;
import br.eti.ftxavier.boadica.model.Role;

@Service
public class RoleService {
	
	@Autowired
	private RoleDao roleDao;
	
	@Transactional
	public List<Role> list() {
		return roleDao.findAll();
	}
	
	@Transactional
	public void save(Role role) {
		roleDao.save(role);
	}

	public Role findById(Long identifier) {
		return roleDao.findById(identifier);
	}
}
