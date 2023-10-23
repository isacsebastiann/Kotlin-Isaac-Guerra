package com.example.usuariolap.repositorio

import com.example.usuariolap.model.Table1
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
@Repository
interface TableRepository : JpaRepository<Table1, Long?> {
    fun findById(id: Long?):Table1?
}