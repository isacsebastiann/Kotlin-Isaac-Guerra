package com.example.usuariolap.services

import com.example.usuariolap.model.Table1
import com.example.usuariolap.repositorio.TableRepository
import jakarta.persistence.Table
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class TableService {
    @Autowired
    lateinit var tableRepository:TableRepository

    fun list ():List<Table1>{
        return tableRepository.findAll()
    }
    fun save(table:Table1):Table1 {
        try{
            return tableRepository.save(table)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
    fun update(table: Table1): Table1{
        try {
            tableRepository.findById(table.id)
                ?: throw Exception("ID no existe")

            return tableRepository.save(table)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
}

