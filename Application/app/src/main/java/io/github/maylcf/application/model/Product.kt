package io.github.maylcf.application.model

import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("id")
    val id: String,
    @SerializedName("prname")
    val name: String,
    @SerializedName("primage")
    val image: String,
    @SerializedName("prprice")
    val price: String,
)