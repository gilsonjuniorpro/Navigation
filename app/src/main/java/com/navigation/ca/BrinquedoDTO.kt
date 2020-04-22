package com.navigation.ca

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BrinquedoDTO (
    var codBrinquedo: Int?,
    var descricao: String?,
    var status: String?,
    var codCategoria: Int?,
    var preco: String?,
    var foto: String?,
    var diasDevolucao: String?,
    var situacao: String?,
    var acao: String?,
    var codLocacao: Int?
): Parcelable {}