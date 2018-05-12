package itssmt.taller.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import itssmt.taller.entity.TMaestro;

@Repository
@Transactional
public interface ITMaestroDao extends JpaRepository<TMaestro, Integer> {

}
