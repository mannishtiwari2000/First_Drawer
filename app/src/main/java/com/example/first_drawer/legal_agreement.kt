package com.example.first_drawer

import android.net.Uri
import android.os.AsyncTask
import android.os.Bundle
import android.os.FileUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.github.barteksc.pdfviewer.PDFView
import java.io.BufferedInputStream
import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL
import javax.net.ssl.HttpsURLConnection


class legal_agreement : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val url:String="https://mindorks.s3.ap-south-1.amazonaws.com/courses/MindOrks_Android_Online_Professional_Course-Syllabus.pdf"
        val view:View= inflater.inflate(R.layout.fragment_legal_agreement, container, false )
        val webView:WebView=view.findViewById(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.settings.setSupportZoom(true)
        webView.settings.javaScriptEnabled = true


        return view
    }

}