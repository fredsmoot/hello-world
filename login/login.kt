/**
* A Login Form Example in Kotlin Android
*/
class LoginActivity : AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
 
 // Add LoginScreenState to top-level AppState so when action is dispatched is can call its reducer
 data class AppState(
  val coreAppState: CoreAppState = CoreAppState(navigation = initialNavigationState),
  val loginScreenState = LoginScreenState: LoginScreenState()
 )
 
 // This is where the screen info goes.
 data class LoginScreenState(
  val emailInput: String = "ron.brasil@gmail.com", 
  val passwordInput: String = "xxxxxx"
 )
 
 data class LoginViewModel(val emailInput: String, val passwordInput: String)
 
  fun toLoginViewModel(state: AppState) = LoginViewModel(
      emailInput = state.loginScreenState.email,
      passwordInput = state.loginScreenState.password
  )
  
   fun render(model: LoginViewModel){
      emailView.text = model.emailInput
      passwordView.text = model.passwordInput
   }
}
  
