// AppState is a top-level data class where we set our state properties to have 
// access to its information.
data class AppState(
     val coreAppState: CoreAppState = CoreAppState(navigation = initialNavigationState),
     val counterScreenState: CounterScreenState = CounterScreenState()
)
