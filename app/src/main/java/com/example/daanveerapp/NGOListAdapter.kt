package com.example.daanveerapp

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.daanveerapp.databinding.SingleNgoItemBinding

class NGOListAdapter(var context: Context, var data: List<NGOData>) :
    RecyclerView.Adapter<NGOListAdapter.NGOListViewHolder>() {

    class NGOListViewHolder(var binding: SingleNgoItemBinding, var data: List<NGOData>) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.call.setOnClickListener {
                binding.call.context.startActivity(
                    Intent(
                        Intent.ACTION_DIAL,
                        Uri.parse("tel:${data[adapterPosition].phoneNum}")
                    )
                )
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NGOListViewHolder {
        return NGOListViewHolder(
            SingleNgoItemBinding.inflate(
                LayoutInflater.from(context),
                parent,
                false
            ), data
        )
    }

    override fun onBindViewHolder(holder: NGOListViewHolder, position: Int) {
        holder.binding.name.text = data.get(position).name
        holder.binding.email.text = data.get(position).email
        holder.binding.address.text = data.get(position).address
        holder.binding.providedItemRv.adapter = NGODonationListAdapter(data[position].donationItems)

    }

    override fun getItemCount(): Int {
        return data.size
    }

}