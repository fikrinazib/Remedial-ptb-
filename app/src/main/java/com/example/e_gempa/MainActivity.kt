 package com.example.e_gempa

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.e_gempa.adapter.AdapterGempa
import com.example.e_gempa.listGempa.FeaturesItem
import com.example.e_gempa.listGempa.ListGempaResponse
import com.example.e_gempa.retrofit.Api
import com.example.e_gempa.retrofit.Retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


 class MainActivity : AppCompatActivity() {

         lateinit var recyclerView: RecyclerView
         lateinit var adapter: AdapterGempa

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter : AdapterGempa = AdapterGempa()

        val data =ArrayList<FeaturesItem>()

        recyclerView = findViewById(R.id.rv_gempa)

        val client:Api = Retrofit().getService()

        val call: Call<ListGempaResponse> = client.getData()


        call.enqueue(object : Callback<ListGempaResponse>{
            @SuppressLint("SuspiciousIndentation")
            override fun onResponse(call: Call<ListGempaResponse>, response: Response<ListGempaResponse>) {
            val respon:ListGempaResponse? = response.body()
                if (respon!= null){
                    val list : List<FeaturesItem>  = respon.features as List<FeaturesItem>
                    adapter.setListGempa(list)
                }
                Log.d("xixixixixxii", respon.toString())

                adapter.setOnClickListener(object : AdapterGempa.clickListener{
                    override fun onItemClick(position: Int) {
                            val ke_detailgempa = Intent (this@MainActivity, DetailGempa::class.java)
                            ke_detailgempa.putExtra("id_gempa", respon?.features?.get(position)?.id)
                            startActivity(ke_detailgempa)
                    }
                })
            }

            override fun onFailure(call: Call<ListGempaResponse>, t: Throwable) {
                Toast.makeText(this@MainActivity,t.localizedMessage,Toast.LENGTH_LONG).show()
            }

        })

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}







