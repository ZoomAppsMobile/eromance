package com.zoomapps.eromance.Models

data class GetListCitiesModel(var code: Int,
                         var data: List<GetListCitiesModel>,
                         var id: Int,
                         var value: String
)
