class CounterView(context: Context, attr: AttributeSet) : LinearLayout(context, attr) {
    @Inject lateinit var eventHandler: CounterViewEventHandler
    @Inject lateinit var store: Store<AppState, Any>
    private val toolbar: Toolbar by bindView(R.id.toolbar)
    private val countView: EditText by bindView(R.id.count)
    
    val compSub = CompositeSubscription()

    init {
        diComponent.inject(this)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
    }
 
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
    
@OnClick fun onClickIncrement(){
    eventHandler.incrementTapped()
}

fun render(model: CounterStateModel) {
  countView.text = model.count
}
}
