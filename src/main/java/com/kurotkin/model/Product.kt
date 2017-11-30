package com.kurotkin.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

/**
 * Created by Vitaly Kurotkin on 30.11.2017.
 */

@Entity
@Table(name = "products")
data class Product (
        @JsonProperty("name")                   // Свойство в JSON объекте
        @Column(name = "name", length = 200)    // Поле в БД и длина
        val name: String = "",                  // Неизменяемое свойство name, с пустой строкой в качестве значения по умолчанию

        @JsonProperty("description")
        @Column(name = "description", length = 1000)
        val description: String = "",

        @Id                                     // Поле - Primary Key
        @JsonProperty("id")
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO) // Также говорим ему что оно - Autoincrement
        val id: Long = 0L
)
