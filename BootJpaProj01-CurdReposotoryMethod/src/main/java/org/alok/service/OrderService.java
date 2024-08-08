package org.alok.service;

import java.util.List;

import org.alok.entity.StarHotel;
import org.alok.repository.IStarHotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("hotelService")
public class OrderService implements IOrder {

	@Autowired
	private IStarHotel hotelRepo;
	
	public OrderService() 
	{
		System.out.println("OrderService::0-Param Constructor");
	}
	
	@Override
	public String itemsOrder(StarHotel hotel) 
	{
		System.out.println("InMemory Proxy Class:"+hotelRepo.getClass()+"....."+hotelRepo.getClass().getSuperclass());
		System.out.println("Before Save Method Id value: "+hotel.getItemId());
		StarHotel starHotel = hotelRepo.save(hotel);
		return "Hotel Class having Id Value: "+starHotel.getItemId();
	}

	@Override
	public long items() {
		
		return hotelRepo.count();
	}

	@Override
	public Iterable<StarHotel> showAll() {
		Iterable<StarHotel> list = hotelRepo.findAll();
		return list;
	}

	@Override
	public boolean itemIsAvailable(Integer id) {
		return hotelRepo.existsById(id);
	}

	@Override
	public Iterable<StarHotel> showByIds(Iterable<Integer> list) {

		return hotelRepo.findAllById(list);
	}

	@Override
	public String itemsAdd(Iterable<StarHotel> list) 
	{
		  List<StarHotel> items = (List<StarHotel>) hotelRepo.saveAll(list);
		return items.size()+" of items  are added";
	}

}
