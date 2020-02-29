package org.resturant.repository;

import org.resturant.model.CatagoriesTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<CatagoriesTbl, String> {
	
	@Query("select c from CatagoriesTbl c where c.catDescription=?1")
	public CatagoriesTbl findCategoryDescription(String catDescription);
	
	@Query("select c from CatagoriesTbl c order by c.catagoraryId desc")
	public CatagoriesTbl getLastId();

}