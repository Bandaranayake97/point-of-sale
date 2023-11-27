package com.codeware.pointofsale.config;

import com.codeware.pointofsale.Dto.ItemDto;
import com.codeware.pointofsale.Entity.Items;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }


}
