package com.codeware.pointofsale.service;

import com.codeware.pointofsale.Dto.ItemDto;
import com.codeware.pointofsale.Dto.Responce.ItemsResponce;

import java.util.List;

public interface ItemService {
    String saveIterm(ItemDto itemDto);

    List<ItemsResponce> getNameAndStatus(String itemname);
}
