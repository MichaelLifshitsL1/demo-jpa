package com.example.demo

import com.example.demo.domain.Batch
import com.example.demo.domain.Item
import com.example.demo.repo.BatchRepository
import com.example.demo.repo.ItemRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.*


@RunWith(SpringRunner::class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    lateinit var batchRepository: BatchRepository

    @Autowired
    lateinit var itemRepository: ItemRepository

    @Test
    fun test1() {

        val batch = Batch(id = UUID.randomUUID(), name = "Batch 1")
        val items = setOf<Item>(Item(id = UUID.randomUUID(), name = "Item 1", batch = batch),
                Item(id = UUID.randomUUID(), name = "Item 2", batch = batch))
        batch.items = items

        batchRepository.save(batch)

        println("+++++++++++")
        batchRepository.findAll().forEach(::println)

        println("+++++++++++")
        batchRepository.findAll().toList()[0].items?.forEach(::println)

        println("+++++++++++")
        itemRepository.findAll().forEach(::println)

    }

}
