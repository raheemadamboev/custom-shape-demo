package xyz.teamgravity.customshapedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import xyz.teamgravity.customshapedemo.ui.theme.CustomShapeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomShapeDemoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box {
                        Box(
                            modifier = Modifier
                                .size(100.dp)
                                .clip(SpeechBubbleShape())
                                .background(Color.Red)
                                .padding(
                                    vertical = 16.dp,
                                    horizontal = 24.dp
                                )
                        ) {
                            Text(
                                text = stringResource(id = R.string.hello_world)
                            )
                        }
                    }
                }
            }
        }
    }
}