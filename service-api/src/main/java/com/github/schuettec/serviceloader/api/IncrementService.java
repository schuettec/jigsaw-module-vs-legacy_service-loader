package com.github.schuettec.serviceloader.api;

/**
 * A simple service that increments the specified integer value.
 * @author chris
 *
 */
public interface IncrementService {

	/**
	 * Increments the specified number.
	 * @param number The number.
	 * @return Returns the increment.
	 */
	public int increment(int number);
	
}
