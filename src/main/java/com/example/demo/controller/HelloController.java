package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Hello APIs", description = "Basic greeting endpoints")
public class HelloController {

    @Operation(
            summary = "Get greeting message",
            description = "Returns a simple hello message for testing OpenAPI"
    )
    @ApiResponse(responseCode = "200", description = "Successful response",
            content = @Content(schema = @Schema(implementation = String.class)))
    @GetMapping("/hello")
    public String hello() {
        return "Hello from FEATURE branch!";
    }



}
