package com.aaron.common.api;

import java.util.List;

/**
 * 
 * 
 * @author Aaron
 * @date 2017��7��3��
 * @version 1.0
 * @package_name common_api
 */
public interface DubboService {

	String sayHello(String name);

	public List getUsers();

}