package org.innovait.keyuptobroadcast

import android.accessibilityservice.AccessibilityService
import android.content.Intent
import android.util.Log
import android.view.KeyEvent
import android.view.accessibility.AccessibilityEvent


class MyAccessibilityService : AccessibilityService() {
    val INTENT_KEY_ACTION: String = "org.innovait.action.NEW_KEY_UP"
    val INTENT_KEY_CODE: String = "KEY_CODE"

    override fun onInterrupt() {}

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}

    override fun onKeyEvent(event: KeyEvent?): Boolean {
        var keyCode: String = ""
        var keyEvent: Int = 0

        if (event != null){
            keyEvent = event.action

            if (keyEvent == KeyEvent.ACTION_UP) {
                keyCode = event.keyCode.toString()
                val intentKey: Intent = Intent(INTENT_KEY_ACTION)
                intentKey.putExtra(INTENT_KEY_CODE, keyCode)
                sendBroadcast(intentKey)
            }
        }

        Log.d("inn", "$keyCode $keyEvent")

        return super.onKeyEvent(event)
    }
}
