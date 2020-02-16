// Add top-level appReducer so that its called when an action is dispatched.

data class appReducer(state: AppState, action: Any) = when(action) {
coreAppState = reduceCoreAppState(state.coreAppState, action),
counterScreenState = reduceCounterScreenState(state.counterScreenState, action)
}
