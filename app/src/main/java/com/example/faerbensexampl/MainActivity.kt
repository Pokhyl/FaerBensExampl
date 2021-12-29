package com.example.faerbensexampl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.annotation.NonNull

import com.google.android.gms.tasks.OnFailureListener

import com.google.firebase.firestore.DocumentReference

import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QueryDocumentSnapshot

import com.google.firebase.firestore.QuerySnapshot

import com.google.android.gms.tasks.OnCompleteListener
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext


class MainActivity : AppCompatActivity() {
    private val scope = CoroutineScope(newSingleThreadContext("name"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   //     val db = FirebaseFirestore.getInstance()
        // Create a new user with a first and last name
//        val user: MutableMap<String, Any> = HashMap()
//        user["first"] = "Ada"
//        user["last"] = "Lovelace"
//        user["born"] = 1815



var repository = FirebaseRepository()
//        scope.launch {
//            repository.register("fgsfhfs@fhfwww.com","1234567890")
//        }

        scope.launch {
            println(repository.login("fgsfhfs@fhfwww.com","1234567890").additionalUserInfo.toString())
        }


// Add a new document with a generated ID
//        db.collection("users")
//            .add(user)
//            .addOnSuccessListener { documentReference ->
//        println(documentReference)
//            }
//            .addOnFailureListener { e -> println(e.message+"!!!!!!!!!!!!!!!!!!!!!!!")}
//        db.collection("users")
//            .get()
//            .addOnCompleteListener { task ->
//                if (task.isSuccessful) {
//                    for (document in task.result) {
//                        println(document.id + " => " + document.data)
//                    }
//                } else {
//                    println( "Error getting documents."+ task.exception)
//                }
//            }
    }
}