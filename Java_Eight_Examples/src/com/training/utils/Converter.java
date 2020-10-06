/**
 * 
 */
package com.training.utils;

/**
 * @author manan
 *
 *@param <T>
 *@param <R>
 *
 *
 *Create Service Class with Lamda Expressions to convert
 *USD to INR and Farenheit to Celsius.
 */
@FunctionalInterface
public interface Converter<T, R> {

	public R convert(T t);
}
