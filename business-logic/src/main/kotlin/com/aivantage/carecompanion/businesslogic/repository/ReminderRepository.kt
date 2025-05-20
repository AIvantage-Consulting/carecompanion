package com.aivantage.carecompanion.businesslogic.repository

import com.aivantage.carecompanion.businesslogic.entities.Reminder
import java.time.Instant

interface ReminderRepository {
    suspend fun add(reminder: Reminder)
    suspend fun complete(reminderId: String, completedAt: Instant)
    suspend fun getUpcoming(from: Instant): List<Reminder>
}
