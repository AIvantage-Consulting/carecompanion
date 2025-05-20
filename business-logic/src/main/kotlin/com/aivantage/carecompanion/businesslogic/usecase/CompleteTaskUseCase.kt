package com.aivantage.carecompanion.businesslogic.usecase

interface CompleteTaskUseCase {
    suspend fun execute(reminderId: String)
}
