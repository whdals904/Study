package jm.study.program.jpa.service;

import jm.study.program.jpa.domain.item.Book;
import jm.study.program.jpa.domain.item.Item;
import jm.study.program.jpa.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Transactional
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    @Transactional
    public void updateItem(Long itemId, String name, int price, int page, int stockQuantity) {
        Book item = (Book) itemRepository.findOne(itemId);
        item.setName(name);
        item.setPrice(price);
        item.setPage(page);
        item.setStockQuantity(stockQuantity);
    }

    public List<Item> findItems(){
        return itemRepository.findAll();
    }

    public Item findOne(Long itemId){
        return itemRepository.findOne(itemId);
    }

}
