package com.example.daanveerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daanveerapp.databinding.ActivityNgosectionBinding

class NGOSection : AppCompatActivity() {
    private lateinit var binding: ActivityNgosectionBinding
    private val data = listOf<NGOData>(
        NGOData(
            "Uday Foundation",
            "233, Block-D, Sarvodaya Enclave",
            " 01126561444", "info@udayfoundation.org",
            listOf(NGOData.DonationItems("Book"), NGOData.DonationItems("Cloth"))
        ),
        NGOData(
            "Goonj",
            "Bali Nagar, Delhi Haat",
            "01126972351",
            "mail@goonj.org",
            listOf(NGOData.DonationItems("Book"))
        ),
        NGOData(
            "Asha Bhawan",
            "",
            "9250928910","info@ashabhawan.org",
            listOf(NGOData.DonationItems("Food"), NGOData.DonationItems("Cloth"), NGOData.DonationItems("Book"))
        ),
        NGOData("Lakshyam", "", "+911140154493","", listOf(NGOData.DonationItems("Cloth"), NGOData.DonationItems("Book")))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNgosectionBinding.inflate(
            layoutInflater
        )
        setContentView(binding!!.root)

        binding.ngoRv.adapter = NGOListAdapter(this, data)
    }
}