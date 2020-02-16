// Handles user-event clicks and dispatches actions to Reducers.
@Singleton class CounterViewEventHandler @Inject constructor(private val store: Store<AppState, Any>,
                                                             private val screenActionCreator: CounterScreenActionCreator) {
    fun toolbarBackTapped() {
        store.dispatch(GoBack)
    }
    
   fun incrementTapped() {
        store.dispatch(Increment)
    }
    
    fun decrementTapped() {
        store.dispatch(Decrement)
    }
}
