package com.es.aplicacion.dto

import com.es.aplicacion.model.Direccion

data class UsuarioRegisterDTO(
    val username: String,
    val email: String,
    val password: String,
    val passwordRepeat: String,
    val rol: String?,
    val calle: String,
    val num: String,
    val municipio: String,
    val provincia: String,
    val cp: String,
    val ciudad: String
)
