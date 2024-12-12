import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.finalexamapp2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameField = findViewById<EditText>(R.id.username)
        val passwordField = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val welcomeMessage = findViewById<TextView>(R.id.welcomeMessage)
        val errorMessage = findViewById<TextView>(R.id.errorMessage)

        // Initialement, le message de bienvenue et le message d'erreur sont cachés
        welcomeMessage.visibility = View.GONE
        errorMessage.visibility = View.GONE

        loginButton.setOnClickListener {
            val username = usernameField.text.toString()
            val password = passwordField.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                errorMessage.visibility = View.VISIBLE
                welcomeMessage.visibility = View.GONE
            } else if (username == "testuser" && password == "password123") {
                welcomeMessage.text = "Bienvenue, $username!"
                welcomeMessage.visibility = View.VISIBLE
                errorMessage.visibility = View.GONE
            } else {
                errorMessage.text = "Nom d'utilisateur ou mot de passe incorrect"
                errorMessage.visibility = View.VISIBLE
                welcomeMessage.visibility = View.GONE
            }
        }
    }
}
