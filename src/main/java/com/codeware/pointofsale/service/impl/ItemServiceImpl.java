package com.codeware.pointofsale.service.impl;

import com.codeware.pointofsale.Dto.ItemDto;
import com.codeware.pointofsale.Dto.Responce.ItemsResponce;
import com.codeware.pointofsale.Entity.Items;
import com.codeware.pointofsale.config.ModelMapperConfig;
import com.codeware.pointofsale.repo.ItermRepo;
import com.codeware.pointofsale.service.ItemService;
import com.codeware.pointofsale.util.mappers.Itemmaper;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItermRepo itemsrepo;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private Itemmaper itemmaper;

    @Override
    public String saveIterm(ItemDto itemDto) {
        Items items = modelMapper.map(itemDto,Items.class);
        if(!itemsrepo.existsById(items.getItemId())){
            itemsrepo.save(items);
            return "sucsucce fuly " + items.getItemId();
        }else {
            throw new RuntimeException("already save");
        }
    }

    @Override
    public List<ItemsResponce> getNameAndStatus(String itemname) {
        List<Items> items = itemsrepo.findAllByItemsNameEqualsAndActiveIsTrue(itemname);
        if(items.size()>0) {
//            List<ItemsResponce> itemsResponce = modelMapper.map(items, new TypeToken<List<ItemsResponce>>() {
//            }.getType());
            List<ItemsResponce> itmslisttwwo = itemmaper.entityListToDtoList(items);
            return itmslisttwwo;
        }else {
            throw new RuntimeException("miss the name of "+itemname );
        }
    }

}
