package lesson_22

class MainScreenViewModel(private val mainScreenState: MainScreenState) {

    data class MainScreenState(
        var data: String?,
        var isLoading: Boolean = false,
    )

    fun loadData() {
        var currentState = mainScreenState.copy(data = null)
        currentState = mainScreenState.copy(isLoading = true)
        currentState = mainScreenState.copy(data = "Загруженные данные", isLoading = false)
    }
}