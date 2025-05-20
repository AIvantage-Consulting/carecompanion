package com.aivantage.carecompanion.businesslogic.usecase

import com.aivantage.carecompanion.businesslogic.entities.CareTask

interface ScheduleReminderUseCase {
    suspend fun execute(task: CareTask)
}
