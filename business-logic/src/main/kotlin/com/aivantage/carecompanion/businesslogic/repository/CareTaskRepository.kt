package com.aivantage.carecompanion.businesslogic.repository

import com.aivantage.carecompanion.businesslogic.entities.CareTask

interface CareTaskRepository {
    suspend fun save(task: CareTask)
    suspend fun findById(id: String): CareTask?
    suspend fun getAll(): List<CareTask>
}
