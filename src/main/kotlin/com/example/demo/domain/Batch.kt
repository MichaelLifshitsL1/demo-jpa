package com.example.demo.domain

import java.util.*
import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.OneToMany

@Entity
class Batch(

        @Id
        val id: UUID,

        @Column(nullable = false)
        val name: String,

        @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
        @JoinTable(
                name="BatchItems",
                joinColumns = [JoinColumn( name="batch_id")],
                inverseJoinColumns = [JoinColumn( name="item_id")]
        )
        var items: Set<Item>? = mutableSetOf()

) {
        override fun toString(): String {
                return "id=$id, name=$name"
        }
}