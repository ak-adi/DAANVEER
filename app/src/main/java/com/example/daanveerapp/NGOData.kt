package com.example.daanveerapp

data class NGOData(
    var name: String,
    var address: String,
    var phoneNum: String,
    var email: String,
    var donationItems: List<DonationItems>
) {
    data class DonationItems(var item:String)
}
