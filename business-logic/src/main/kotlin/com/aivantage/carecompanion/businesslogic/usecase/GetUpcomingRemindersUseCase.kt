package com.aivantage.carecompanion.businesslogic.usecase

import com.aivantage.carecompanion.businesslogic.entities.Reminder
import java.time.Instant

interface GetUpcomingRemindersUseCase {
    suspend fun execute(from: Instant): List<Reminder>
}
