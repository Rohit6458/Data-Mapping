package com.Mapping.Mapping.Config;

import com.Mapping.Mapping.Entity.Team;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapper {


    @Bean
    public org.modelmapper.ModelMapper get(){
        return new org.modelmapper.ModelMapper();
    }


}
