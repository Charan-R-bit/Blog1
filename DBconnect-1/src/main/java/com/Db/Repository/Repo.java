package com.Db.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Db.Entity.Entity;

@Repository
public interface Repo extends JpaRepository<Entity, Integer>
{
	
}
