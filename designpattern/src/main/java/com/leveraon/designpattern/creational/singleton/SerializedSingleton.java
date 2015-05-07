package com.leveraon.designpattern.creational.singleton;

import java.io.Serializable;

/**
 * Serialization and Singleton
 * 
 * Sometimes in distributed systems, we need to implement Serializable interface
 * in Singleton class so that we can store it�s state in file system and
 * retrieve it at later point of time. Here is a small singleton class that
 * implements Serializable interface also.
 * 
 * @author yu.sang
 *
 */
public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8136782468119739505L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}

	/**
	 * The problem with above serialized singleton class is that whenever we
	 * deserialize it, it will create a new instance of the class. Let�s see it
	 * with a simple program.
	 * 
	 * So it destroys the singleton pattern, to overcome this scenario all we
	 * need to do it provide the implementation of readResolve() method.
	 * 
	 * @return
	 */
	protected Object readResolve() {
		return getInstance();
	}

}
