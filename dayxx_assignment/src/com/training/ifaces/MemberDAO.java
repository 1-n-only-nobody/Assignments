/**
 * 
 */
package com.training.ifaces;

import java.util.Collection;

import com.training.entity.Member;

/**
 * @author manan
 *
 */
public interface MemberDAO<T> extends DAO<T> {

	Collection<T> findAll();
	T findById(long id);
	boolean add(T entity);
	boolean remove(long id);
	boolean update(T oldEntity, T updatedEntity);
	Collection<T> getPenaltyList();
	
}
