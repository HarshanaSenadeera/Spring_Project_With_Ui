package lk.ijse.spring.config.service;

import lk.ijse.spring.dto.ItemDTO;

import java.util.List;

public interface ItemService {

    void saveItem(ItemDTO item);

    void deleteItem(String id);

    List<ItemDTO> getAllItem();

    ItemDTO findItem(String id);

    void updateItem(ItemDTO c);
}
