package com.example.phones.data

import com.example.phones.R
import com.example.phones.model.Phones

class DataSource {


    fun loadPhones(): List <Phones> {
        return listOf(
            Phones(R.string.Phone1,R.drawable.iphone) ,
            Phones(R.string.Phone2,R.drawable.samsung),
            Phones(R.string.Phone3,R.drawable.huawei),
            Phones(R.string.Phone4,R.drawable.motorla)



        )
    }



    }
