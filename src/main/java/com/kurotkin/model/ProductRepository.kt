package com.kurotkin.model

import org.springframework.data.repository.CrudRepository

/**
 * Created by Vitaly Kurotkin on 01.12.2017.
 */

// Слой работы с данными обладает набором CRUD операций
interface ProductRepository : CrudRepository<Product, Long>