package com.example.bottomnavigationhomework4_1.ui.task

import java.io.Serializable

data class TaskModel(
    val task: String,
    var time: Long
) : Serializable