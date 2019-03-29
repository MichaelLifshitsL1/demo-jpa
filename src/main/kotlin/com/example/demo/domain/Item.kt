package com.example.demo.domain

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class Item(

        @Id
        val id: UUID,

        @Column(nullable = false)
        val name: String,

        @JoinColumn(name = "batch_id", nullable = false)
        @ManyToOne
        val batch: Batch

)