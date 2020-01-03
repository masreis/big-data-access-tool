package net.marcoreis.bdat.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.marcoreis.bdat.entity.DataStore;

@Repository
public interface DataStoreRepository
		extends CrudRepository<DataStore, Long> {

	// @Query("SELECT d FROM DataService d")
	List<DataStore> findAll();

	// @Query("SELECT d FROM DataService d where d.id = :id")
	Optional<DataStore> findById(@Param("id") Long id);

}
