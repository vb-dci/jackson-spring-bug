package com.example.basecrudspringrestendpoint.presentation.endpoint.core

import com.example.basecrudspringrestendpoint.presentation.dto.core.BaseDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody

abstract class BaseCrudController<Dto : BaseDto> {

    @PostMapping("/saveAll")
    @ResponseBody
    fun saveAsList(@RequestBody dtos: List<Dto>): List<Dto> = listOf()
}