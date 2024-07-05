package com.eclatsol.kotlinsample

fun main(){

    val taskName : String = "Download Task"
    val taskManager = TaskManager(BgTask(taskName),BgExecute(taskName))
    taskManager.create()
    taskManager.execute()
}

interface Task {
    fun create()
}

interface ExecutionTask{
    fun execute()
}

class BgTask(val taskName : String) : Task{
    override fun create() {
        println("Task: " + taskName + "Created!")
    }
}

class BgExecute(val taskName : String) : ExecutionTask{
    override fun execute() {
        println("Task: " + taskName + " is Executing...")
    }

}



class TaskManager(val create : Task, val executor: ExecutionTask) : Task by create,ExecutionTask by executor{ //This is delegation //By ek keyword che kotlin
//    override fun create() { Without use override method
//        create.create()
//    }
//
//    override fun execute() {
//        executor.execute()
//    }

}


class DelegationClass {


}

