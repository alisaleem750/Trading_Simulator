package main.com.m3c.gp.controller;

import java.util.List;

import main.com.m3c.gp.model.Client;
import main.com.m3c.gp.model.Order;

/**
 * Author: Metin Dagcilar
 * Date: 19/04/18
 * Database Manager interface
 */

public interface DBManagerInterface{
	void insertOrder(Order order);
	Order getOrder(int clientId);
	List<Order> getClientOrders(int clientId);
	
	void insertClient(Client order);
	Client getClient(int clientId);
	
	boolean checkEmailExists(String email);
	boolean checkEmailPasswordMatch(String email, String password);
}