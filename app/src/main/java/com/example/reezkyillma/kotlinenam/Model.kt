package com.example.reezkyillma.kotlinenam


import retrofit2.http.Query

object Model {
    data class  Result(val query: Query)
    data class  Query(val searchinfo : SearchInfo)
    data class SearchInfo(val totalhits : Int)
}