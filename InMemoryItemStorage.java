package by.tms.storage;

import by.tms.model.Item;

import java.util.ArrayList;
import java.util.List;

public class InMemoryItemStorage {
	private static List<Item> items = new ArrayList<>();

	private static InMemoryItemStorage inMemoryItemStorage;

	private InMemoryItemStorage(){

	}

	public static InMemoryItemStorage getInstance() {
		if (inMemoryItemStorage == null){
			inMemoryItemStorage = new InMemoryItemStorage();
			return inMemoryItemStorage;
		}
		return inMemoryItemStorage;
	}

	{
		items.add(new Item(1, "Swort art online", "автор: Рэки Кавахара. В 2022 году, человечеству удалось изобрести альтернативную виртульность", 320));
		items.add(new Item(2, "Death Note", "Автор: Цугуми Ода. Я убил их, я стал убийцей. Я убил этих двоих, человеческая жизнь это не шутки." +
				"Имел ли я права судить таких же, как я людей? ", 220));
		items.add(new Item(3, "Fairy tail", "Автор: Хиро Масима. Гильдия волшебников в королевстве Фиор.", 500));
	}

	public List<Item> getAll(){
		return new ArrayList<>(items);
	}

	public Item getById(int id){
		for (Item item : items) {
			if (item.getId() == id) return item;
		}
		return null;
	}

}
