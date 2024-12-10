package lesson_16

class Order(
    val number: Int,
    private var status: String,
) {

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun sendRequestForChangeStatus(newStatus: String) {
        changeStatus(newStatus)
    }
}