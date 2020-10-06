/**
 * 
 */
package com.training.ifaces;

import java.util.Collection;

/**
 * @author manan
 *
 */
public interface DAO<T> {

	Collection<T> findAll();
	T findById(long id);
	boolean add(T entity);
	boolean remove(long id);
	boolean update(T oldEntity, T updatedEntity);
}