package lesson_22

class MainScreenViewModel() {

    data class MainScreenState(
        var data: String? = null,
        var isLoading: Boolean = false,
    )

    private val mainScreenState = MainScreenState()

    fun loadData() {
        mainScreenState.isLoading = true
        Thread.sleep(1000)
        mainScreenState.isLoading = false
        mainScreenState.data = "Загруженные данные"
    }
}