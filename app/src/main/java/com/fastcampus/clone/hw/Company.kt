package com.fastcampus.clone.hw

data class Company(
    val name:String,
    val date: String,
    val where: String
)
private fun createData(): ArrayList<Company>{
    val data = arrayListOf<Company>()
    data.add(Company("NAVER","2000","Korea"))
    data.add(Company("APPLE","2000","USA"))
    data.add(Company("LINE","2000","Japan"))


    return data
}
