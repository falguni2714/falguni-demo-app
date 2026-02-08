package com.example.demo.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "User information")
public class UserDto {

    @Schema(example = "101")
    private Long id;

    @Schema(example = "Falguni Patel")
    private String name;

    @Schema(example = "falguni@example.com")
    private String email;

    public UserDto(Long id, String falguniPatel, String mail) {
    }

    // getters & setters
}
