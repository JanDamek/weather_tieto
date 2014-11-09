package com.damek.weather_tieto.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.damek.weather_tieto.domain.Location;
import com.damek.weather_tieto.domain.Location_;

@Repository
@Transactional
public class LocationDaoImpl implements LocationDao {

	@Autowired
	private EntityManager em;
	
	@Override
	public Location findById(String location) {
		return em.find(Location.class, location);
	}

	@Override
	public List<Location> getAllLocationsOrderedByLocation() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Location> criteria = cb.createQuery(Location.class);
        Root<Location> location = criteria.from(Location.class);

        criteria.select(location).orderBy(cb.asc(location.get(Location_.location)));
        return em.createQuery(criteria).getResultList();
	}

	@Override
	public void register(Location newLocation) {
		em.persist(newLocation);
		return;
	}

	@Override
	public List<Location> getAllLocationsOrderedbyLastUpdate() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Location> criteria = cb.createQuery(Location.class);
        Root<Location> location = criteria.from(Location.class);

        criteria.select(location).orderBy(cb.asc(location.get(Location_.last_update)));
        return em.createQuery(criteria).getResultList();
	}

}
