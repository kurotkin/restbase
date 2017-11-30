package com.kurotkin.controller

import org.springframework.stereotype.Service

/**
 * Created by Vitaly Kurotkin on 30.11.2017.
 */

@Service // Позволяем IoC контейнеру внедрять класс
// Внедряем репозиторий в качестве зависимости
class ProductService (private val productRepository: ProductRepository){
    fun all(): Iterable<Product> = productRepository.findAll() // Возвращаем коллекцию сущностей, функциональная запись с указанием типа

    fun get(id: Long): Product = productRepository.findOne(id)

    fun add(product: Product): Product = productRepository.save(product)

    fun edit(id: Long, product: Product): Product = productRepository.save(product.copy(id = id)) // Сохраняем копию объекта с указанным id в БД. Идиоматика Kotlin говорит что НЕ изменяемый - всегда лучше чем изменяемый (никто не поправит значение в другом потоке) и предлагает метод copy для копирования объектов (специальных классов для хранения данных) с возможностью замены значений

    fun remove(id: Long) = productRepository.delete(id)
}