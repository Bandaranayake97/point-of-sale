package com.codeware.pointofsale.util.mappers;

import com.codeware.pointofsale.Dto.Responce.ItemsResponce;
import com.codeware.pointofsale.Entity.Items;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface Itemmaper {
    List<ItemsResponce> entityListToDtoList(List<Items> items);
}
