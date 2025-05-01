package rahul.lohra.lockscreennotification

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import rahul.lohra.lockscreennotification.ui.theme.LockScreenNotificationTheme

class FullScreenTestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        window.addFlags(
            WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED or
                    WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON or
                    WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
        )
        setContent {
            LockScreenNotificationTheme {
                Box(modifier = Modifier.padding(12.dp)) {
                    Column {
                        Text("Inside full screen activity", modifier = Modifier.padding(top = 30.dp))
                        Button(onClick = {
                            finish()
                        }) {
                            Text("Finish full screen activity")
                        }
                    }
                }

            }
        }
    }
}