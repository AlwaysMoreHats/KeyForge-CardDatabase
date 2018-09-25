package com.keyforge.libraryaccess.LibraryAccessService.data

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "type")
data class Type (
    @Id
    val id: Int = 0,
    val name: String = ""
)