// Holds the state
data class CounterViewModel(val count: Int) {
  override toString(): String {
    return "CounterViewModel(count = $count)"
  }
}

// Transformational function converting state to viewmodel 
// so we can render values to our views.
fun toCounterViewModel(state: AppState) = CounterViewModel(
  count = state.counterAppState.count.toString()
)

fun render(model: CounterStateModel) {
  countView.text = model.count
}
