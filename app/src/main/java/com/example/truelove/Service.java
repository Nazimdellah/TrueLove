package com.example.truelove;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface Service {
    @post("users/{utilisateur}/repos")

    fun listReposString(@Path("utilisateur") MUtilisateur: String): Call<String>
}
