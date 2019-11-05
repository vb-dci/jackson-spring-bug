package com.example.basecrudspringrestendpoint.presentation.endpoint

import com.example.basecrudspringrestendpoint.presentation.dto.CustomerDto
import com.example.basecrudspringrestendpoint.presentation.endpoint.core.BaseCrudController
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/api/v1/customer")
class CustomerController() : BaseCrudController<CustomerDto>()