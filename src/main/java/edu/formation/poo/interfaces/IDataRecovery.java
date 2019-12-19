package edu.formation.poo.interfaces;

import java.util.List;

/**
 * @author Seme
 *
 */
public interface IDataRecovery<T> {
  public List<T> findAll();

  public T findById(Long id);
}
