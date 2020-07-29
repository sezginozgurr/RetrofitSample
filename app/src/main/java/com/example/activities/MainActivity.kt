package com.example.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.model.NewsModel
import com.example.retrofit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recycleList()
    }

    fun recycleList() {
        var newsList: ArrayList<NewsModel> = ArrayList()
        var news = NewsModel(
            "",
            "Korona Virus",
            "COVID-19 ile enfekte birinin yakınındayken virüsü solursanız veya virüsün bulaştığı bir yüzeye dokunduktan sonra gözlerinize, burnunuza veya ağzınıza dokunursanız enfekte olabilirsiniz."
        )
        var news2 = NewsModel(
            "",
            "Okullarda bu uygulamalar olacak",
            "Kılavuzda belirtilen önlemleri alan devlet okullarının MEB'e, özel okulların ise TSE'ye başvuracaklarını anlatan Elif Kırbaş, başvurusu tamamlanan okullarda dış denetim gerçekleştirileceğini ve şartları sağlayan okullara \"temiz\" belgesi verileceğini kaydetti."
        )
        newsList.add(news)
        newsList.add(news2)
        binding.recyler.adapter

    }
}
