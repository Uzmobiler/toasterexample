package uz.mobiler.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    companion object {

        fun show(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}