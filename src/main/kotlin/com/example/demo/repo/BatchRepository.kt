package com.example.demo.repo

import com.example.demo.domain.Batch
import org.springframework.data.repository.CrudRepository
import java.util.*

interface BatchRepository : CrudRepository<Batch, UUID>
