/**
* A Login Form Example in Kotlin Android
*/
class LoginActivity : AppCompatActivity() {
 
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 
        // get reference to all views
        var et_user_name = EditText byView R.id.et_username 
        var et_password = EditText byView R.id.et_password 
 
        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            et_user_name.setText("")
            et_password.setText("")
        }
 
        // set on-click listener
        btn_submit.setOnClickListener {
            val user_name = et_user_name.text;
            val password = et_password.text;
            Toast.makeText(this@MainActivity, user_name, Toast.LENGTH_LONG).show()
 
            // your code to validate the user_name and password combination
            // and verify the same
 
        }
    }
}