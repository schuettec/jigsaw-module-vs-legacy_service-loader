package com.github.schuettec.serviceloader.impl;

import com.github.schuettec.serviceloader.api.IncrementService;

public class IncrementServiceImpl  implements IncrementService{

	@Override
	public int increment(int number) {
		return number+1;
	}

}
