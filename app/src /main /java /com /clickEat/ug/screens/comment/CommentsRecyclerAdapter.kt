package com.clickEat.ug.screens.comment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.clickEat.ug.data.ServerComment
import com.clickEat.ug.databinding.CommentItemLayoutBinding

class CommentsRecyclerAdapter:
    androidx.recyclerview.widget.ListAdapter<ServerComment, CommentsRecyclerAdapter.ViewHolder>(CommentDiffCallback()) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CommentsRecyclerAdapter.ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: CommentsRecyclerAdapter.ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class ViewHolder private constructor(val binding: CommentItemLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: ServerComment){
            binding.comments = item
            binding.executePendingBindings()
        }

        companion object{
            fun from(parent: ViewGroup):ViewHolder{
                val layoutInflater = LayoutInflater.from(parent.context!!)
                val binding = CommentItemLayoutBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}

class CommentDiffCallback: DiffUtil.ItemCallback<ServerComment>(){
    override fun areItemsTheSame(oldItem: ServerComment, newItem: ServerComment): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: ServerComment, newItem: ServerComment): Boolean {
        return oldItem.product_id == newItem.product_id
    }
}
