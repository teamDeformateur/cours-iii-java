package edu.formation.poo.genericite;

/**
 * Generic version of the Box class.
 * 
 * @param <T> the type of the value being boxed
 */
public class Boite<T> {
  // T stands for "Type"
  private T type;

  public void set(T t) {
    this.type = t;
  }

  public T get() {
    return type;
  }
}
