package com.example.flixbee.repository;

import com.example.flixbee.domain.association.Association;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociationRepository extends CrudRepository<Association, String> {
}
