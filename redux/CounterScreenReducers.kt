// Reducers are pure functions where app state can be copied and set.
// The state is checked by a when conditional on a certain Action.

fun reducerCounterScreenState(state: CounterScreenState, action: Any) = when(action) {
  is ToCounterScreen -> CounterScreenState() // reinitialize state.
  is Increment -> state.copy(count = state.count + 1)
  is Decrement -> state.copy(count = state.count - 1)
  else -> state
}
