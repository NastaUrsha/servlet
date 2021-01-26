package by.tms.model;

import by.tms.storage.InMemoryItemStorage;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	private List<Item> list = new ArrayList<>();

	public void addItem(Item item){
		list.add(item);
	}

	public List<Item> getAll(){
		return new ArrayList<>(list);
	}
}
