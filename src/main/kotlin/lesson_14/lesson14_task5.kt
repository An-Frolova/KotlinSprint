package lesson_14

class Chat() {

    val allMessagesList = mutableListOf<Message>()

    fun addMessage(textMessage: String, authorName: String) {
        allMessagesList.add(Message(authorName, textMessage))
    }

    fun addThreadMessage(parentMessageId: Int, textMessage: String, authorName: String) {
        allMessagesList.add(ChildMessage(authorName, textMessage, parentMessageId))
    }

    fun printChat() {
        var messagesMap = mapOf<Int, List<Message>>()
        var childMessagesMap = mapOf<Int, List<ChildMessage>>()

        allMessagesList.forEach { message ->
            if (message is ChildMessage) {
                val childMessagesList = allMessagesList.filterIsInstance<ChildMessage>()
                childMessagesMap = childMessagesList.groupBy { it.parentMessageId }
            } else {
                val regularMessagesList = allMessagesList.filter { it !is ChildMessage }
                messagesMap = regularMessagesList.groupBy { it.id }
            }
        }
        messagesMap.forEach { (id, listOfMessages) ->
            listOfMessages.forEach {
                println("${it.author}: ${it.text}")
            }
            childMessagesMap.forEach { (parentId, listOfChildMessages) ->
                if (parentId == id) {
                    listOfChildMessages.forEach {
                        println("   ${it.author}: ${it.text}")
                    }
                }
            }
        }
    }
}

open class Message(
    val author: String,
    val text: String,
    var id: Int = 0,
) {

    companion object {
        var finalId = 0
    }

    init {
        id = ++finalId
    }
}

class ChildMessage(
    author: String,
    text: String,
    val parentMessageId: Int,
    id: Int = 0,
) : Message(author, text, id)