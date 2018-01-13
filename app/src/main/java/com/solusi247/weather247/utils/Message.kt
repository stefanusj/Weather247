package com.solusi247.weather247.utils

import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.widget.Toast
import com.solusi247.weather247.R
import kotlinx.android.synthetic.main.custom_toast.view.*

object Message {

    val INFORMATION = 111
    val ERROR = 222

    fun showToast(context: Context, message: String, type: Int, length: Int = Toast.LENGTH_SHORT) {
        val toast = Toast(context)
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.custom_toast, null)
        when (type) {
            INFORMATION -> {
                view.ivIcon.setImageResource(R.drawable.ic_info)
                view.customToast.background = ContextCompat.getDrawable(context, R.drawable.custom_toast_info_background)
                view.tvMessage.setTextColor(ContextCompat.getColor(context, R.color.message_info))
            }
            ERROR -> {
                view.ivIcon.setImageResource(R.drawable.ic_error)
                view.customToast.background = ContextCompat.getDrawable(context, R.drawable.custom_toast_error_background)
                view.tvMessage.setTextColor(ContextCompat.getColor(context, R.color.message_error))
            }
        }
        view.tvMessage.text = message
        view.tvMessage.text = message
        toast.view = view
        toast.duration = length
        toast.show()
    }

}