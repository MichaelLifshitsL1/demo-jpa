package com.example.demo.repo

import com.example.demo.domain.Item
import org.hibernate.engine.jdbc.batch.spi.Batch
import org.springframework.data.repository.CrudRepository
import java.util.*

interface ItemRepository : CrudRepository<Item, UUID>
