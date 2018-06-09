package com.zoomapps.eromance.Models

data class LocationTypes(var code: Int,
                         var data: List<LocationTypes>,
                         var id: Int,
                         var key: String,
                         var value: String
)