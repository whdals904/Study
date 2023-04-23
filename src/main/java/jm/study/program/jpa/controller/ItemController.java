package jm.study.program.jpa.controller;

import jm.study.program.jpa.domain.item.Item;
import jm.study.program.jpa.domain.item.Book;
import jm.study.program.jpa.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
@Slf4j
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/items/new")
    private String createItemForm(Model model){
        model.addAttribute("form", new BookForm());
        return "items/createItemForm";
    }


    @PostMapping("/items/new")
    public String create(BookForm form) {
        Book book = new Book();
        book.setName(form.getName());
        book.setPrice(form.getPrice());
        book.setStockQuantity(form.getStockQuantity());
        book.setAuthor(form.getAuthor());
        book.setIsbn(form.getIsbn());
        book.setPage(form.getPage());


        itemService.saveItem(book);
        return "redirect:/";

    }

    @GetMapping("/items")
    public String list(Model model){
        List<Item> items = itemService.findItems();
        model.addAttribute("items", items);
        return "items/itemList";
    }

    @GetMapping("/items/{itemId}/edit")
    public String list(@PathVariable("itemId") Long itemId, Model model){
        Book book = (Book) itemService.findOne(itemId);

        BookForm bookForm = new BookForm();
        bookForm.setAuthor(book.getName());
        bookForm.setIsbn(book.getIsbn());
        bookForm.setPrice(book.getPrice());
        bookForm.setPage(book.getPage());

        bookForm.setStockQuantity(book.getStockQuantity());
        bookForm.setName(book.getName());
        bookForm.setId(book.getId());

        model.addAttribute("form", bookForm);
        return "items/updateItemForm";
    }

    @PostMapping("/items/{itemId}/edit")
    public String updateItem(@PathVariable Long itemId, @ModelAttribute("form") BookForm form) {

        itemService.updateItem(itemId, form.getName(), form.getPrice(), form.getPage(), form.getStockQuantity());

        return "redirect:/items";
    }
}
