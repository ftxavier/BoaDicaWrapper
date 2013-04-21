package br.eti.ftxavier.boadica.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.eti.ftxavier.boadica.model.Usuario;

@Repository
public class UsuarioDao extends AbstractDao<Usuario, Long> {

	public Usuario findByLogin(String login) {
		Criteria criteria = getSessionFactory().getCurrentSession()
				.createCriteria(Usuario.class)
				.add(Restrictions.eq("login", login));
		return (Usuario) criteria.uniqueResult();
	}
}
