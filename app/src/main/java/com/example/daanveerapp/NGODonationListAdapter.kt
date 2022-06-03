package com.example.daanveerapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.daanveerapp.databinding.SingleNgoDonateItemBinding

class NGODonationListAdapter(var data: List<NGOData.DonationItems>) :
    RecyclerView.Adapter<NGODonationListAdapter.DonationViewHolder>() {
    class DonationViewHolder(var binding: SingleNgoDonateItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DonationViewHolder {
        return DonationViewHolder(
            SingleNgoDonateItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DonationViewHolder, position: Int) {
        holder.binding.item.text = data[position].item
    }

    override fun getItemCount(): Int {
        return data.size
    }
} 