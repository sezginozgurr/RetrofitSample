package com.example.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.Utils.Utils
import com.example.model.NewsModel
import com.example.retrofit.R


class NewsHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate(R.layout.row_item_news, container, false)
) {
    val newsImage: ImageView = itemView.findViewById(R.id.news_img)
    val newsTitle: TextView = itemView.findViewById(R.id.news_title)
    val newsDetail: TextView = itemView.findViewById(R.id.news_detail)

    fun bind(newsModel: NewsModel) {
        newsTitle.text = newsModel.title
        newsDetail.text = newsModel.detail
        Utils.loadImage(newsImage, newsModel.imgNews, Utils.getProgressDrawable(newsImage.context))
    }
}