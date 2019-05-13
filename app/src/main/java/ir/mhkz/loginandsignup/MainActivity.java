package ir.mhkz.loginandsignup;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText Usuario, Contraseña, regUsuario, regContraseña,
            regNombre, regApellido, regCorreo, regConfirmacion;
    Button login, signUp, regIngresar;
    TextInputLayout txtInLayoutUsername, txtInLayoutPassword, txtInLayoutRegPassword;
    CheckBox rememberMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario = findViewById(R.id.Usuario);
        Contraseña = findViewById(R.id.Contraseña);
        login = findViewById(R.id.login);
        signUp = findViewById(R.id.signUp);
        txtInLayoutUsername = findViewById(R.id.txtInLayoutUsername);
        txtInLayoutPassword = findViewById(R.id.txtInLayoutPassword);
        rememberMe = findViewById(R.id.Recordar);


        ClickLogin();


        //SignUp's Button for showing registration page
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClickSignUp();
            }
        });


    }

    //This is method for doing operation of check login
    private void ClickLogin() {

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Usuario.getText().toString().trim().isEmpty()) {

                    Snackbar snackbar = Snackbar.make(view, "Porfavor llene el espacio",
                            Snackbar.LENGTH_LONG);
                    View snackbarView = snackbar.getView();
                    snackbarView.setBackgroundColor(getResources().getColor(R.color.red));
                    snackbar.show();
                    txtInLayoutUsername.setError("Debe escribir su usuario");
                } else {
                    //Here you can write the codes for checking username
                }
                if (Contraseña.getText().toString().trim().isEmpty()) {
                    Snackbar snackbar = Snackbar.make(view, "Porfavor llene el espacio",
                            Snackbar.LENGTH_LONG);
                    View snackbarView = snackbar.getView();
                    snackbarView.setBackgroundColor(getResources().getColor(R.color.red));
                    snackbar.show();
                    txtInLayoutPassword.setError("Debe escribir su contraseña");
                } else {
                    //Here you can write the codes for checking password
                }

                if (rememberMe.isChecked()) {
                    //Here you can write the codes if box is checked
                } else {
                    //Here you can write the codes if box is not checked
                }

            }

        });

    }

    //The method for opening the registration page and another processes or checks for registering
    private void ClickSignUp() {

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.register, null);
        dialog.setView(dialogView);

        regUsuario = dialogView.findViewById(R.id.regUsuario);
        regContraseña = dialogView.findViewById(R.id.regContraseña);
        regNombre = dialogView.findViewById(R.id.regNombre);
        regApellido = dialogView.findViewById(R.id.regApellido);
        regCorreo = dialogView.findViewById(R.id.regCorreo);
        regConfirmacion = dialogView.findViewById(R.id.regConfirmacion);
        regIngresar = dialogView.findViewById(R.id.regIngresar);
        txtInLayoutRegPassword = dialogView.findViewById(R.id.txtInLayoutRegPassword);

        regIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (regUsuario.getText().toString().trim().isEmpty()) {

                    regUsuario.setError("Porfavor llene el espacio");
                } else {
                    //Here you can write the codes for checking username
                }
                if (regContraseña.getText().toString().trim().isEmpty()) {
                    txtInLayoutRegPassword.setPasswordVisibilityToggleEnabled(false);
                    regContraseña.setError("Porfavor llene el espacio");
                } else {
                    txtInLayoutRegPassword.setPasswordVisibilityToggleEnabled(true);
                    //Here you can write the codes for checking password
                }
                if (regNombre.getText().toString().trim().isEmpty()) {

                    regNombre.setError("Porfavor llene el espacio");
                } else {
                    //Here you can write the codes for checking firstname

                }
                if (regApellido.getText().toString().trim().isEmpty()) {

                    regApellido.setError("Porfavor llene el espacio");
                } else {
                    //Here you can write the codes for checking lastname
                }
                if (regCorreo.getText().toString().trim().isEmpty()) {

                    regCorreo.setError("Porfavor llene el espacio");
                } else {
                    //Here you can write the codes for checking email
                }
                if (regConfirmacion.getText().toString().trim().isEmpty()) {

                    regConfirmacion.setError("Porfavor llene el espacio");
                } else {
                    //Here you can write the codes for checking confirmemail
                }
            }
        });


        dialog.show();


    }


}
