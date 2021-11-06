package com.bc.user.model;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "jsr330")
public interface UserMapper {
//    IHashingService hashingService;
//    @Inject
//    public UserMapper(IHashingService hashingService) {
//        this.hashingService = hashingService;
//    }

    @Mappings({
        @Mapping(
            source = "password",
            target = "passwordHash"
//            expression = "java(hashingService.hash(dto.getPassword()))"
        )
    })
    User dtoToEntity(CreateUserDto dto);

}
