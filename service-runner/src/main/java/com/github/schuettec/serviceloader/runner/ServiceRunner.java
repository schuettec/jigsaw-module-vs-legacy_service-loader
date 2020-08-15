package com.github.schuettec.serviceloader.runner;

import java.util.ServiceLoader;

import com.github.schuettec.serviceloader.api.IncrementService;

public class ServiceRunner {

	public static void main(String[] args) {
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
		try {
			Class<?> legacyImpl = systemClassLoader
					.loadClass("com.github.schuettec.serviceloader.impl.IncrementServiceImpl");
			System.out.println("Found class " + legacyImpl);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {

			ServiceLoader<IncrementService> serviceLoader = ServiceLoader.load(IncrementService.class,
					systemClassLoader);
			IncrementService incrementService = serviceLoader.findFirst().orElseThrow();
			int increment = incrementService.increment(1);
			if (increment == 2) {
				System.err.println("OK.");
				System.exit(0);
			} else {
				System.err.println("Increment service returned wrong result.");
				System.exit(0);
			}
		} catch (Exception e) {
			System.err.println("Could not get IncrementService instance!");
			e.printStackTrace();
			System.exit(-1);
		}
	}

}
