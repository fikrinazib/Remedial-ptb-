package com.example.e_gempa

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.e_gempa.databinding.ActivityDetailGempaBinding
import com.example.e_gempa.detailGempa.DetailResponse
import com.example.e_gempa.retrofit.Api
import com.example.e_gempa.retrofit.Retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DetailGempa : AppCompatActivity() {
    var getIntent: Intent? = null

    lateinit var binding: ActivityDetailGempaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailGempaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val getID = intent.getStringExtra("id_gempa")

        getIntent = intent
        if (getIntent != null) {
            val client: Api = Retrofit().getService()
            val call: Call<DetailResponse> = client.getDetail(getID)

            call.enqueue(object : Callback<DetailResponse> {
                @SuppressLint("SetTextI18n")
                override fun onResponse(
                    call: Call<DetailResponse>,
                    response: Response<DetailResponse>
                ) {
                    val respon = response.body()
                    Log.d("detailusulandebug", respon.toString())

                    if (respon != null) {
                        binding.location.text = respon.properties?.place.toString()
                        binding.date.text = respon.properties?.time.toString()
                        binding.richter.text = respon.properties?.mag.toString()
                        binding.lat.text = respon.geometry?.coordinates?.get(1).toString()
                        binding.longg.text = respon.geometry?.coordinates?.get(0).toString()
                        binding.tsunami.text = respon.properties?.tsunami.toString()
                        if (respon.properties?.tsunami == 1) {
                            binding.tsunami.text = "Berpotensi Tsunami"
                        } else {
                            binding.tsunami.text = "Tidak berpotensi Tsunami"
                        }
                        binding.link.text = respon.properties?.url.toString()
                    }
                }

                override fun onFailure(call: Call<DetailResponse>, t: Throwable) {
                    Toast.makeText(this@DetailGempa, t.localizedMessage, Toast.LENGTH_SHORT).show()
                }

            })

        }

    }
}

