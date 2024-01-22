package com.example.MaterialM3.models

class User {
    var username: String=""
    var email: String=""
    var pass: String=""
    var confPass: String=""
    var userid: String=""

    constructor(username:String, email:String, pass:String, confPass: String, userid: String){
        this.username = username
        this.email=email
        this.pass= pass
        this.confPass = confPass
        this.userid = userid
    }
    constructor()
}