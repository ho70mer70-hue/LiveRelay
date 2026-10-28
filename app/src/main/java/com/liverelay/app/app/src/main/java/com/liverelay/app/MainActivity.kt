package com.liverelay.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

```
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val layout = LinearLayout(this).apply {
        orientation = LinearLayout.VERTICAL
        gravity = Gravity.CENTER
        setPadding(32, 32, 32, 32)
        setBackgroundColor(Color.rgb(18, 18, 24))
    }

    val title = TextView(this).apply {
        text = "LiveRelay"
        textSize = 32f
        setTextColor(Color.WHITE)
        gravity = Gravity.CENTER
    }

    val description = TextView(this).apply {
        text = "Transmissão ao vivo do Twitch para o YouTube"
        textSize = 16f
        setTextColor(Color.LTGRAY)
        gravity = Gravity.CENTER
    }

    val button = Button(this).apply {
        text = "Preparar transmissão"
        isEnabled = false
    }

    layout.addView(title)
    layout.addView(description)
    layout.addView(button)

    setContentView(layout)
}
```

}
