package org.alok.service;

import org.alok.entity.StarHotel;

public interface IOrder {
	public String itemsOrder(StarHotel items);
	public long items() ;
	public Iterable<StarHotel> showAll();
	public boolean itemIsAvailable(Integer id);
	public Iterable<StarHotel> showByIds(Iterable<Integer> ids);
	public String itemsAdd(Iterable<StarHotel> list);
}
