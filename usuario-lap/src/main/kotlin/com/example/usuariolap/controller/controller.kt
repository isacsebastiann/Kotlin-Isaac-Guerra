package com.example.usuariolap.controller

import com.example.usuariolap.model.Table1
import com.example.usuariolap.services.TableService
import jakarta.persistence.Table
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.service.connection.ConnectionDetails
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/table1")   //endpoint
class Controller {
    @Autowired
    lateinit var tableService: TableService

    @GetMapping
    fun list ():List <Table1>{
        return tableService.list()
    }
    @PostMapping
    fun save (@RequestBody table1: Table1):ResponseEntity<Table1>{
        return ResponseEntity(tableService.save(table1), HttpStatus.OK)
    }
    @PutMapping
    fun update (@RequestBody table1:Table1):ResponseEntity<Table1>{
        return ResponseEntity(tableService.update(table1), HttpStatus.OK)
    }
    @PatchMapping
    fun updateName (@RequestBody table1: Table1):ResponseEntity<Table1>{
        return ResponseEntity(tableService.updateName(table1), HttpStatus.OK)
    }
    @DeleteMapping("/table/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean?{
        return tableService.delete(id)
    }
}




