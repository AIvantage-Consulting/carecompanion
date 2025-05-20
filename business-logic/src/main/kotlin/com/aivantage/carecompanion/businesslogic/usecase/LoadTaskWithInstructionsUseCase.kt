package com.aivantage.carecompanion.businesslogic.usecase

import com.aivantage.carecompanion.businesslogic.entities.CareTask
import com.aivantage.carecompanion.businesslogic.entities.TaskInstruction

interface LoadTaskWithInstructionsUseCase {
    suspend fun execute(taskId: String): Pair<CareTask, List<TaskInstruction>>?
}
