package com.aivantage.carecompanion.businesslogic.entities

sealed class TaskInstruction {

  data class Speak(val resourceId: String) : TaskInstruction()
  data class Display(val resourceId: String) : TaskInstruction()
  data class Animate(val resourceId: String) : TaskInstruction()
  data class Simultaneous(val children: List<TaskInstruction>) : TaskInstruction()
}
