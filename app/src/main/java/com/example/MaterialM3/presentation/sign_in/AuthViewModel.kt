package com.example.MaterialM3.presentation.sign_in

import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.MaterialM3.models.User
import com.example.MaterialM3.navigation.ROUTE_MENU
import com.example.MaterialM3.navigation.ROUTE_REGISTER
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class AuthViewModel(
    var navController: NavHostController,
    var context: Context
) {
    var mAuth:FirebaseAuth

    init {
        mAuth= FirebaseAuth.getInstance()
    }

    fun signup(username:String, email: String, pass: String, confPass: String){
        if (username.isBlank() || email.isBlank() || pass.isBlank() || confPass.isBlank()){
            Toast.makeText(context, "Please fill in your details", Toast.LENGTH_LONG).show()
        }
        else
            if (pass != confPass){
                Toast.makeText(context,"Password does not match", Toast.LENGTH_LONG).show()
            }
        else{
            mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener {

                if (it.isSuccessful){
                    val userData = User(username, email, pass, confPass, mAuth.currentUser!!.uid)
                    val regRef = FirebaseDatabase.getInstance().getReference()
                        .child("Users/" + mAuth.currentUser!!.uid)

                    regRef.setValue(userData).addOnCompleteListener {
                        if (it.isSuccessful){
                            Toast.makeText(context, "User created Successfully", Toast.LENGTH_LONG).show()
                            navController.navigate(ROUTE_MENU)
                        }
                        else{
                            Toast.makeText(context, "${it.exception!!.message}", Toast.LENGTH_LONG).show()
                            navController.navigate(ROUTE_REGISTER)
                        }
                    }
                }else{
                    navController.navigate(ROUTE_REGISTER)
                }
            }
            }
    }
}