package com.example.contextmenuinkotlin

import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.ContextMenu.ContextMenuInfo
import android.view.MenuItem
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var textView: TextView? = null
    var relativeLayout: RelativeLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        registerForContextMenu(textView)
    }

    override fun onCreateContextMenu(menu: ContextMenu, v: View, menuInfo: ContextMenuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu.setHeaderTitle("Choose a color")
        menu.add(0, v.id, 0, "Yellow")
        menu.add(0, v.id, 0, "Gray")
        menu.add(0, v.id, 0, "Cyan")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if (item.title === "Yellow") {
            relativeLayout!!.setBackgroundColor(Color.YELLOW)
        } else if (item.title === "Gray") {
            relativeLayout!!.setBackgroundColor(Color.GRAY)
        } else if (item.title === "Cyan") {
            relativeLayout!!.setBackgroundColor(Color.CYAN)
        }
        return true
    }
}
