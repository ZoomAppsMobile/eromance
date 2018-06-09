package com.zoomapps.eromance.Models

data class GetListCountriesModel (var code : Int,
                                  var data : List<GetListCountriesModel>,
                                  var id : Int,
                                  var value : String
                                  )
