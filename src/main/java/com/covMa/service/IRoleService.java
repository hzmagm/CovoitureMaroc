package com.covMa.service;

public interface IRoleService<T> extends IService<T> {

	T findByName(String name);
}
